class Tmp{
	private String name;
	private String city;
	private int age;
	
	public Tmp(){
		this(null, null, 0);
		System.out.println("기본 생성자가 호출되었음");
	}
	public Tmp(String name, String city, int age){
		System.out.println("매개변수 생성자가 호출되었음");
		this.name = name;
		this.city = city;
		this.age = age;
	}
	public void print() {
		System.out.println(name + city + age);
	}
}
public class Ex8 {
	public static void main(String[] args) {
		Tmp t1 = new Tmp(); 
		t1.print();
		String s1 = "junho";
		System.out.println("junho".length());
	}
	
}
