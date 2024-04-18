package default_2;
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
	public abstract String getInfo();
}

class S22 extends Device implements USBC{
	@Override
	public void readUSB() {
		System.out.println(getName() + ": USB read");
	}
	@Override
	public void connectC() {
		System.out.println(getName() + ": USB-C connect");
	}
	@Override
	public void writeUSB() {
		System.out.println(getName() + ": USB write");
	}
	@Override
	public String getInfo() {
		return getName() + " " + getYear() + " " + price;
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
		System.out.println(getName() + ": USB-A read");
	}
	@Override
	public String getInfo() {
		return getName() + " " + getYear() + " " + price;
	}
	private String price = "$120";
	public MP3(String name, int year) {
		super(name, year);
	}
}
class TV extends Device{
	@Override
	public String getInfo() {
		return getName() + " " + getYear() + " " + price;
	}
	private String price = "$5000";
	public TV(String name, int year) {
		super(name, year);
	}
}
class USBhub {
	private USB[] ports;
	private int index;
	public USBhub() {
		ports = new USB[4];
		index = 0;
	}
	public void addDevice(USB u) {
		if (index < ports.length) {
			ports[index++] = u;
			if (u instanceof USBA) {
				((USBA)u).connectA();
			}
			else if (u instanceof USBC) {
				((USBC)u).connectC();
			}
		}
		else {
			System.out.println("USBhub is full");
		}
	}
	public void readUSBs() {
		for (int i = 0; i < index ; i++) {
			ports[i].readUSB();
		}
		System.out.println();
	}
	public void writeUSBs() {
		for (int i = 0; i < index ; i++) {
			ports[i].writeUSB();
		}
		System.out.println();
	}
}
public class ex10 {
	public static void printInfor(Device d) {
		System.out.println(d.getInfo());
	}
	public static void main(String[] args) {
		S22 s22 = new S22("s22", 2022);
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
