package default_2;
import java.util.Vector;
import java.util.Iterator;
class Point{
	private int x;
	private int y;
	public Point(int x, int y) {
		this.x = x; this.y = y;
	}
	@Override
	public String toString() {
		return "(" + x + "," + y + ")";
	}
}
public class ex2 {
	public static void main(String[] args) {
		Vector<Point> v = new Vector<Point>();
		v.add(new Point(5,16));
		v.add(new Point(2,12));
		v.add(new Point(11,4));
		Iterator i = v.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
