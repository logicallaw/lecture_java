class Point{
	private int x;
	private int y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public void print() {
		System.out.printf("(%d,%d)", x,y);
	}
}
public class Problem3 {
	public static void main(String[] args) {
		Point[][] p = new Point[2][2];
		p[0][0] = new Point(1,1);
		p[0][1] = new Point(2,2);
		p[1][0] = new Point(3,3);
		p[1][1] = new Point(4,4);
		for(Point[] row : p) {
			for(Point col : row) {
				col.print();
			}
		}
		
	}

}
