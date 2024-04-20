//Don't add public about all class.
class Car{
	//All field is private.
	private String model;
	private String color;
	private int year;
	
	//constructor
	public Car() {}
	public Car(String model) {
		this.model = model;
		this.color = null;
		this.year = 0;
	}
	public Car(String model, String color) {
		this.model = model;
		this.color = color;
		this.year = 0;
	}
	public Car(String model, String color, int year) {
		this.model = model;
		this.color = color;
		this.year = year;
	}
	
	public void printInfor() {
		System.out.println(model + " " + color + " " + year);
	}
}

public class Lab04_1 {
	public static void main(String[] args) {
		Car car1 = new Car();
		Car car2 = new Car("MC20");
		Car car3 = new Car("MC20", "white");
		Car car4 = new Car("MC20", "white", 2021);
		
		car1.printInfor();
		car2.printInfor();
		car3.printInfor();
		car4.printInfor();
		
	}

}
