package default_2;
class Point3{
	private int x;
	private int y;
	public Point3(int x, int y) {
		this.x = x; this.y = y;
	}
	@Override
	public String toString() {
		return "Point(" + x + ", " + y + ")";
	}
}
class Circle extends Point3{
	private int r;
	public Circle(int x, int y, int r) {
		super(x, y);
		this.r = r;
	}
	@Override
	public String toString() {
		return super.toString() + ", r = " + r;
	}
}
public class ex8 {
	public static void main(String[] args) {
		Circle c1 = new Circle(3,4,5);
		Circle c2 = new Circle(3,4,5);
		Circle c3 = new Circle(3,4,6);
		if ((c1.toString()).equals(c2.toString())) {
			System.out.println("c1 == c2");
		}
		else {
			System.out.println("c1 != c2");
		}
		if ((c1.toString()).equals(c3.toString())) {
			System.out.println("c1 == c3");
		}
		else {
			System.out.println("c1 != c3");
		}
		
	}

}
