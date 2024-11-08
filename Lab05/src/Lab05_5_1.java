////interface-not create Object.
//interface USB{
//	//You MUSH define readUSB()
//	void readUSB(); //public
//	default void writeUSB() {
//		System.out.println("Can't write to USB");
//	}
//}
////interface-not create Object.
//interface USBA extends USB{
//	//You MUSH define connectA()
//	void connectA(); //public
//}
////interface-not create Object.
//interface USBC extends USB{
//	//You MUSH define connectC()
//	void connectC(); //public
//}
////abstract class-not create Object.
//abstract class Device{
//	//private fields.
//	private String name;
//	private int year;
//	
//	Device(String name, int year){
//		this.name = name; this.year = year;
//	}
//	protected String getName() {
//		return name;
//	}
//	protected int getYear() {
//		return year;
//	}
//	//You MUSH define getInfo()
//	public abstract String getInfo();
//}
//
////S22 MUSH override All abstract methods.
///* You must implements the lists below.
// * public void readUSB();
// * public void connectC();
// * public abstract String getInfo();
// */
//class S22 extends Device implements USBC{
//	private String price = "$1400";
//	public S22(String name, int year) {
//		super(name, year); //go to Device
//	}
//	@Override
//	public void readUSB() {
//		System.out.println(getName() + ": USB read");
//	}
//	@Override
//	public void connectC() {
//		System.out.println(getName() + ": " + "USB-C connected");
//	}
//	@Override
//	public String getInfo() {
//		return getName() + " " + getYear() + " " + price;
//	}
//	//I will override public default void writeUSB().
//	@Override
//	public void writeUSB() {
//		System.out.println(getName() + ": USB write");
//	}
//}
////MP3 MUSH override All abstract methods.
///* You must implements the lists below.
// * public void readUSB();
// * public void connectA();
// * public abstract String getInfo();
// */
//class MP3 extends Device implements USBA{
//	//Exist private String price.
//	private String price = "$120";
//	//Call a parameter constructor.
//	public MP3(String name, int year) {
//		super(name, year); //go to Device
//	}
//	@Override
//	public void readUSB() {
//		System.out.println(getName() + ": USB read");
//	}
//	@Override
//	public void connectA() {
//		System.out.println(getName() + ": " + "USB-A connected");
//	}
//	@Override
//	public String getInfo() {
//		return getName() + " " + getYear() + " " + price;
//	}
//	//implicit default void readUSB()
//}
//
//class TV extends Device{
//	//Exist private String price.
//	private String price = "$5000";
//	//Call a parameter constructor.
//		public TV(String name, int year) {
//			super(name, year);
//		}
//	@Override
//	public String getInfo() {
//		return getName() + " " + getYear() + " " + price;
//	}
//
//}
//class USBhub implements USB{ //USBhub:
//	//private fields.
//	private USB[] ports;
//	private int counter;
//	//void readUSB();
//	@Override
//	public void readUSB() {
//		
//	}
//	//Call a default constructor.
//	public USBhub() {
//		ports = new USB[4]; //S22, MP3
//		counter = 0;
//	}
//	//member function:addDevice, readUSBs, writeUSBs
//	public void addDevice(USB d) {
//		ports[counter++] = d; //upcasting
//		if (d instanceof USBC) {
//			((USBC)d).connectC(); 
//		} else {
//			((USBA)d).connectA();
//		}
//	}
//	public void readUSBs() {
//		for (int i = 0; i < counter; i++) {
//			if (ports[i] instanceof USBC) {
//				((S22)ports[i]).readUSB(); //Call overrided method.
//			} else {
//				((MP3)ports[i]).readUSB(); //Call overrided method.
//			}
//		}
//		System.out.println();
//	}
//	public void writeUSBs() {
//		for (int i = 0; i < counter; i++){
//			//down casting.
//			if (ports[i] instanceof USBC) {
//				((S22)ports[i]).writeUSB(); //Call overrided method.
//			} else {
//				ports[i].writeUSB(); //Call default method.
//			}
//		}
//	}
//}
//public class Lab05_5_1 {
//	//Global function:printInfo
//	public static void printInfo(Device d) {
//		if (d instanceof S22) {
//			System.out.println(((S22)d).getInfo());
//		}
//		else if (d instanceof MP3) {
//			System.out.println(((MP3)d).getInfo());
//		}
//		else {
//			System.out.println(((TV)d).getInfo());
//		}
//	}
//	public static void main(String[] args) {
//		S22 s22 = new S22("S22", 2022);
//		MP3 mp3 = new MP3("MP3", 2005);
//		TV tv = new TV("TV", 2017);
//		
//		Device[] devices = new Device[] { s22, mp3, tv };
//		USBhub hub = new USBhub();
//		
//		for (Device d : devices) {
//			printInfo(d);
//			if (d instanceof USB) {
//				hub.addDevice((USB)d);
//			}
//		}
//		
//		System.out.println();
//		hub.readUSBs();
//		hub.writeUSBs();
//	}
//}
//
