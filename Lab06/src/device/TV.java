package device;

public class TV extends Device{
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
