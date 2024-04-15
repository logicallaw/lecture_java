import java.util.Vector;
import java.util.Iterator;
import java.util.HashMap;
public class ex4 {

	public static void main(String[] args) {
//		Vector<Integer> v1 = new Vector<Integer>();
//		Iterator<Integer> i1 = v1.iterator();
//		while (i1.hasNext()) {
//			int n = i1.next();
//		}
		HashMap<String, String> h = new HashMap<String, String>();
		h.put("apple", "사과");
		String kor = h.get("apple");
		System.out.println(kor.toString());
		
	}

}
