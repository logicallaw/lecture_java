package device;
import usb.USBC;
public class S22 extends Device implements USBC {
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
