import java.util.Vector;
import java.util.Iterator;
class Point{
	//field
	private int x;
	private int y;
	//constructor
	public Point(int x, int y) {
		this.x = x; this.y = y;
	}
	//method
	public String toString() {
		return "(" + x + "," + y + ")";
	}
}
public class Lab07_1 {
	public static void main(String[] args) {
		Vector<Point> v1 = new Vector<Point>();
		v1.add(new Point(5, 16));
		v1.add(new Point(2, 12));
		v1.add(new Point(11, 4));
		Iterator<Point> i1 = v1.iterator();
		while(i1.hasNext()) {
			Point temp = i1.next();
			System.out.println(temp.toString());
		}
	}	

}
