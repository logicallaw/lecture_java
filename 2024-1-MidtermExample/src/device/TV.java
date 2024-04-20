package device;


public class TV extends Device{
	@Override
	public String getInfor() {
		return getName() + " " + getYear() + " " + price;
	}
	private String price = "$5000";
	public TV(String name, int year) {
		super(name, year);
	}
}
