package default_4;
import java.util.ArrayList;
import java.util.Iterator;
class Point{
	@Override
	public String toString() {
		return "(" + x + "," + y + ")";
	}
	private int x;
	private int y;
	public Point(int x, int y) {
		this.x = x; this.y = y;
	}
}
public class ex1 {
	public static void main(String[] args) {
		ArrayList<Point> a = new ArrayList<Point>();
		a.add(new Point(5,6));
		a.add(new Point(2,12));
		a.add(new Point(11,4));
		Iterator<Point> i = a.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
