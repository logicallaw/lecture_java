interface USB{
	void readUSB(); //abstract method
	default void writeUSB() {
		System.out.println("Can't write to USB");
	}
}
interface USBA extends USB {
	void connectA(); //abstract method 
}
interface USBC extends USB {
	void connectC(); //abstract method
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
class S22 extends Device implements USBC {
	/*
	You MUST redefine 3 methods.
	:getInfo, readUSB, connectC
	*/
	@Override
	public String getInfo() {
		return getName() + " " + getYear() + " " + price;
	}
	@Override
	public void readUSB() {
		System.out.println(getName() + ": USB read");
	}
	@Override
	public void connectC() {
		System.out.println(getName() + ": USB-C connected");
	}
	@Override
	public void writeUSB() {
		System.out.println(getName() + ": USB write");
	}
	//Field
	private String price = "$1400";
	//Constructor
	public S22(String name, int year) {
		super(name, year);
	}
}

class MP3 extends Device implements USBA{
	/*
	You MUST redefine 3 methods.
	:getInfo, readUSB, connectA
	*/
	@Override 
	public String getInfo() {
		return getName() + " " + getYear() + " " + price;
	}
	@Override
	public void readUSB() {
		System.out.println(getName() + ": USB read");
	}
	@Override
	public void connectA() {
		System.out.println(getName() + ": USB-A connected");
	}
	//Field
	private String price = "$120";
	//Constructor
	public MP3(String name, int year) {
		super(name, year);
		
	}
}
class TV extends Device{
	/*
	You MUST redefine 1 method.
	:getInfo
	*/
	@Override
	public String getInfo() {
		return getName() + " " + getYear() + " " + price;
	}
	
	//Field
	private String price = "$5000";
	//Constructor
	public TV(String name, int year) {
		super(name, year);
	}
}
class USBhub {
	//Field
	private USB[] hub;
	private int counter;
	//Constructor
	public USBhub() {
		hub = new USB[4];
		counter = 0;
	}
	//Method
	public void addDevice(USB u) {
		if(counter < hub.length) {
			hub[counter++] = u;
			if (u instanceof USBA) {
				((USBA)u).connectA();
			}
			else if (u instanceof USBC) {
				((USBC)u).connectC();
			}
		}
		else {
			System.out.println("hub is full!");
		}
	}
	public void readUSBs() {
		for (int i = 0; i < counter; i++) 
			(hub[i]).readUSB();
		System.out.println();
	}
	public void writeUSBs() {
		for (int i = 0; i < counter; i++) 
			(hub[i]).writeUSB();
	}
	
}
public class Lab05_5 {
	public static void printInfor(Device d) {
		System.out.println(d.getInfo());
	}
	public static void main(String[] args) {
		S22 s22 = new S22("S22", 2022);
		MP3 mp3 = new MP3("MP3", 2005);
		TV tv = new TV("TV", 2017);
		
		Device[] devices = new Device[] {s22, mp3, tv};
		USBhub hub = new USBhub();
		
		for (Device d : devices) {
			printInfor(d);
			if (d instanceof USB)
				hub.addDevice((USB)d);
		}
		
		System.out.println();
		hub.readUSBs();
		hub.writeUSBs();

	}
}