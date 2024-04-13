package device;
import usb.USBA;

public class MP3 extends Device implements USBA{
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
