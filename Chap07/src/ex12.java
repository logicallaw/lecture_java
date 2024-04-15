class Car{
	//Field
	private String name = null;
	private String color = null;
	private int year = 0;
	//Constructor
	public Car() {
		this(null, null, 0);
	}
	public Car(String name) {
		this(name, null, 0);
	}
	public Car(String name, String color) {
		this(name, color, 0);
	}
	public Car(String name, String color, int year) {
		this.name = name; this.color = color; this.year = year;
	}
	//method
	void printInfor() {
		System.out.println(name + " " + color + " " + year);
	}
}
public class ex12 {
	public static void main(String[] args) {
		Car car1 = new Car();
		Car car2 = new Car("MC20");
		Car car3 = new Car("MC20", "white");
		Car car4 = new Car("MC20", "white", 2021);
		
		Car[] carArray = new Car[] {car1, car2, car3, car4};
		for (Car c : carArray)
			c.printInfor();
	}

}
