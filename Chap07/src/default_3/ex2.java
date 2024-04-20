package default_3;
import java.util.ArrayList;
public class ex2 {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<>();
		a.add(Integer.valueOf(5));
		a.add(Integer.valueOf(10));
		a.add(15);
		a.add(20);
		a.add(2,100);
		
		
		java.util.Iterator<Integer> i = a.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		
	}

}
