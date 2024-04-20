package device;

import usb.USBA;

public class MP3 extends Device implements USBA{
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