package device;

public abstract class Device {
	private String deviceName;
	private int year;
	
	Device(String name, int year){
		this.deviceName = name;
		this.year = year;
	}
	
	protected String getName() {
		return deviceName;
	}
	
	protected int getYear() {
		return year;
	}
	
	//return->deviceName year price
	//ex) S22 2022 $1400
	public abstract String getInfor();
}
