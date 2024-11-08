class Point{ //concrete class
	private int x, y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	@Override
	public String toString() {
		return "Point(" + x + ", " + y + ")";
	}
}
class Circle extends Point{
	private int r;
	public Circle(int x, int y, int r) {
		super(x, y);
		this.r = r;
	}
	@Override
	public String toString() {
		return super.toString() + ", r = " + r;
	}
	@Override
	public boolean equals(Object o) {
		return toString().equals(toString());
	}
}
public class Lab06_2 {
	public static void main(String[] args) {
		Circle c1 = new Circle(3, 4, 5);
		Circle c2 = new Circle(3, 4, 5);
		Circle c3 = new Circle(3, 4, 6);
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		//c1 vs c2
		if((c1.toString()).equals((c2.toString()))) {
			System.out.println("c1 == c2");
		}
		else {
			System.out.println("c1 != c2");
		}
		
		//c1 vs c3
		if((c1.toString()).equals((c3.toString()))) {
			System.out.println("c1 == c3");
		}
		else {
			System.out.println("c1 != c3");
		}
	}
}
