class Point{
	//field
	private int x;
	private int y;
	//constructor
	public Point(int x, int y) {
		this.x = x; this.y = y;
	}
	//Overriding
	@Override
	public String toString() {
		return "Point(" + x + "," + y + ")";
	}
}
class Circle extends Point{
	//field
	private int r;
	//constructor
	public Circle(int x, int y, int r) {
		super(x, y);
		this.r = r;
	}
	@Override
	public String toString() {
		return super.toString() + ", r = " + r;
	}
	
}
public class ex23 {
	public static void main(String[] args) {
		Circle c1 = new Circle(3,4,5);
		Circle c2 = new Circle(3,4,5);
		Circle c3 = new Circle(3,4,6);
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		if ((c1).equals(c2)) {
			System.out.println("c1 == c2");
		}
		else {
			System.out.println("c1 != c2");
		}
		if ((c1).equals(c3)) {
			System.out.println("c1 == c3");
		}
		else {
			System.out.println("c1 != c3");
		}
	}

}
