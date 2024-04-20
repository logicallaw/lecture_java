package default_3;
import java.util.Vector;
public class ex1 {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		v.add(Integer.valueOf(5));
		v.add(Integer.valueOf(10));
		v.add(Integer.valueOf(15));
		v.add(1,Integer.valueOf(20));
		
//		java.util.Iterator<Integer> i = v.iterator();
//		while(i.hasNext()) {
//			System.out.println(i.next());
//		}
		
		for (int i = 0; i < v.size(); i++) {
			System.out.println(v.get(i).intValue());
		}
		int sum = 0;
		for (int i = 0; i < v.size(); i++) {
			sum += v.elementAt(i);
		}
		System.out.println("\n" + sum);
	}

}
