package default_4;
interface USB{
	void readUSB();
	default void writeUSB() {
		System.out.println("Can't write to USB");
	}
}
interface USBA extends USB{
	void connectA();
}
interface USBC extends USB{
	void connectC();
}
abstract class Device{
	private String name;
	private int year;
	Device(String name, int year){
		this.name = name; this.year = year;
	}
	protected String getName() {
		return name;
	}
	protected int getYear() {
		return year;
	}
	public abstract String getInfor();
}
class S22 extends Device implements USBC{
	@Override
	public void readUSB() {
		System.out.println(getName() + ": USB read");
	}
	@Override
	public void connectC() {
		System.out.println(getName() + ": USB-C connected");
	}
	@Override
	public String getInfor() {
		return getName() + " " + getYear() + " " + price;
	}
	@Override
	public void writeUSB() {
		System.out.println(getName() + ": USB write");
	}
	
	private String price = "$1400";
	public S22(String name, int year) {
		super(name, year);
	}
}
class MP3 extends Device implements USBA{
	@Override
	public void readUSB() {
		System.out.println(getName() + ": USB read");
	}
	@Override
	public void connectA() {
		System.out.println(getName() + ": USB-A connected");
	}
	@Override
	public String getInfor() {
		return getName() + " " + getYear() + " " + price;
	}
	
	private String price = "$120";
	public MP3(String name, int year) {
		super(name, year);
	}
}
class TV extends Device{
	@Override
	public String getInfor() {
		return getName() + " " + getYear() + " " + price;
	}
	private String price = "$5000";
	public TV(String name, int year) {
		super(name, year);
	}
}
class USBhub{
	private USB[] hub;
	private int count;
	public USBhub() {
		hub = new USB[4];
		count = -1;
	}
	public void addDevice(USB d) {
		if (count < hub.length - 1) {
			hub[++count] = d;
			if (d instanceof USBA) {
				((USBA)d).connectA();
			}
			else if (d instanceof USBC) {
				((USBC)d).connectC();
			}
		}
		else {
			System.out.println("hub is full!");
		}
	}
	public void readUSBs() {
//		for (USB u : hub) {
//			if (u instanceof USBA || u instanceof USBC) {
//				u.readUSB();
//			}
//		}
		for (int i = 0; i < count + 1; i++) {
			hub[i].readUSB();
		}
		System.out.println();
	}
	public void writeUSBs() {
//		for (USB u : hub) {
//			if (u instanceof USBA || u instanceof USBC) {
//				u.writeUSB();
//			}
//		}
		for (int i = 0; i < count + 1; i++) {
			hub[i].writeUSB();
		}
		System.out.println();
	}
}
public class Main {
	public static void printInfor(Device d) {
		System.out.println(d.getInfor());
	}
	public static void main(String[] args) {
		S22 s22 = new S22("S22", 2022);
		MP3 mp3 = new MP3("mp3", 2005);
		TV tv = new TV("TV", 2017);
		
		Device[] devices = new Device[] {s22, mp3, tv};
		USBhub hub = new USBhub();
		
		for (Device d : devices) {
			printInfor(d);
			if (d instanceof USB) {
				hub.addDevice((USB)d);
			}
		}
		
		System.out.println();
		hub.readUSBs();
		hub.writeUSBs();
		
	}

}
