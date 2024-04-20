package device;

import usb.USBC;
public class S22 extends Device implements USBC {
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
		return getName() + " " + getYear() + " " + "$1400";
	}
	@Override
	public void writeUSB() {
		System.out.println(getName() + ": USB write");
	}
	public S22(String name, int year) {
		super(name, year);
	}
}
