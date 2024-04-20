package default_4;
class Point1{
	private int x;
	private int y;
	public Point1(int x, int y) {
		this.x = x; this.y = y;
	}
	@Override
	public String toString() {
		return "Point(" + x + ", " + y + ")";
	}
}
class Circle extends Point1{
	private int r;
	public Circle(int x, int y, int r) {
		super(x, y); this.r = r;
	}
	@Override
	public String toString() {
		return super.toString() + ", r = " + r;
	}
	@Override
	public boolean equals(Object o) {
		if (o instanceof Circle) {
			Circle c = (Circle)o;
			return toString().equals(c.toString());
		}
		else {
			return false;
		}
	}
}
public class ex6 {
	public static void main(String[] args) {
		Circle c1 = new Circle(3, 4, 5);
		Circle c2 = new Circle(3, 4, 5);
		Circle c3 = new Circle(3, 4, 6);
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		if (c1.equals(c2)) {
			System.out.println("c1 == c2");
		}
		else {
			System.out.println("c1 != c2");
		}
		if (c1.equals(c3)) {
			System.out.println("c1 == c3");
		}
		else {
			System.out.println("c1 != c3");
		}
		
	}

}
