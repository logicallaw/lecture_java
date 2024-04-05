class Device_2{
	private String name;
	private int year;
	
	Device_2(String name, int year){
		this.name = name; this.year = year;
	}
	public String getInfo() {
		return name + " " + year; 
	}
	public String getName() { return name; }
	public int getYear() { return year; }
}
class S22_2 extends Device_2{
	private String price = "$1400";
	public S22_2(String name, int year) {
		super(name, year);
	}
	@Override
	public String getInfo() {
		return getName() + " " + getYear() + " " + price;
	}
}
class MP3_2 extends Device_2{
	private String price = "$120";
	public MP3_2(String name, int year) {
		super(name, year);
	}
	@Override
	public String getInfo() {
		return getName() + " " + getYear() + " " + price;
	}
	
}
class TV_2 extends Device_2{
	private String price = "$5000";
	public TV_2(String name, int year) {
		super(name, year);
	}
	@Override
	public String getInfo() {
		return getName() + " " + getYear() + " " + price;
	}
}
public class Lab05_2 {
	public static void printInfo(Device_2 d) {
		System.out.println(d.getInfo());
	}
	public static void main(String[] args) {
		S22_2 s22 = new S22_2("S22", 2022);
		MP3_2 mp3 = new MP3_2("MP3", 2005);
		TV_2 tv = new TV_2("TV", 2017);
		
		Device_2[] device = new Device_2[3];
		device[0] = s22; //upcasting
		device[1] = mp3;
		device[2] = tv;
		
		for (Device_2 d : device) 
			printInfo(d);
	}

}