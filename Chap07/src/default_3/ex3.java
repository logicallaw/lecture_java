package default_3;

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
abstract class Device {
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
		System.out.println(getName() + ": USB-C connected");
	}
	@Override
	public String getInfo() {
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

class USBhub{
	private USB[] port;
	private int index;
	public USBhub() {
		port = new USB[4];
		index = 0;
	}
	public int length() {
		return index + 1;
	}
	void addDevice(USB d) {
		if (index < port.length) {
			if (d instanceof USBA) {
				port[index++] = d;
				((USBA)d).connectA();
			}
			else if (d instanceof USBC) {
				port[index++] = d;
				((USBC)d).connectC();
			}
		}
		else {
			System.out.println("port is full!");
		}
	}
//	public void disconnectUSB() {
//		if (index > 0) {
//			System.out.println(((Device)port[--index]).getInfo() + ": disconnnected");
//			port[index] = null;
//		}
//		else {
//			System.out.println("Can't disconnected USB");
//		}
//	}
	public USB popUSB() {
		if (index > 0) {
			USB temp = port[--index];
			port[index] = null;
			return temp;
		}
		else {
			return null;
		}
	}
	
	public void readUSBs() {
		for(USB u : port) {
			if (u instanceof USBA || u instanceof USBC) {
				u.readUSB();
			}
		}
		System.out.println();
	}
	public void writeUSBs() {
//		for (USB u : port) {
//			if (u instanceof USBA || u instanceof USBC) {
//				u.writeUSB();
//			}
//		}
		for (int i = 0; i < index; i++) {
			port[i].writeUSB();
		}
		
	}
}
public class ex3 {
	public static void printInfor(Device d) {
		System.out.println(d.getInfo());
	}
	public static void main(String[] args) {
		S22 s22 = new S22("s22", 2022);
		MP3 mp3 = new MP3("mp3", 2005);
		TV tv = new TV("TV", 2017);
		
		Device[] devices = new Device[] { s22, mp3, tv};
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
		
		for (int i = 0; i < hub.length(); i++) {
			USB temp = hub.popUSB();
			if (temp instanceof USBA) {
				((USBA)temp).connectA();
			}
			else if (temp instanceof USBC) {
				((USBC)temp).connectC();
			}
		}
		
		System.out.println("hub length: " + (hub.length() - 1));
	}

}
