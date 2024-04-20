package default_2;
import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;
import java.util.Iterator;
import java.util.Objects;
//HashMap -> Set<Entry<K,V>> -> Iterator<Entry<>> -> hasNext(), Next()
class Student7{
	@Override
	public int hashCode() {
		return Objects.hash(name, birth, height);
	}
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student7) {
			Student7 s = (Student7)obj;
			return name.equals(s.name) && birth.equals(s.birth) && height == s.height;
		}
		else {
			return false;
		}
	}
	@Override
	public String toString() {
		return name + " " + birth + " " + height + " ";
	}
	private String name;
	private String birth;
	private int height;
	public Student7(String name, String birth, int height) {
		this.name = name; this.birth = birth; this.height = height;
	}
}
public class ex15 {
	public static void main(String[] args) {
		HashMap<Student7, Integer> map = new HashMap<>();
		map.put(new Student7("dlwlrma", "930519", 162), 15000);
		map.put(new Student7("pby", "000720", 158), 15000);
		map.put(new Student7("pby", "900212", 158), 15000);
		map.put(new Student7("dlwlrma", "930519", 162), 20000);
		
//		for (Student7 s : map.keySet()) {
//			System.out.println(s.toString() + map.get(s));
//		}
		
//		for (Entry<Student7, Integer> e : map.entrySet()) {
//			System.out.println(e.getKey().toString() + e.getValue());
//		}
		
//		Set<Student7> s = map.keySet();
//		Iterator<Student7> i = s.iterator();
//		while(i.hasNext()) {
//			Student7 temp = i.next();
//			System.out.println(temp.toString() + map.get(temp));
//		}
		
//		Set<Entry<Student7, Integer>> s = map.entrySet();
//		Iterator<Entry<Student7, Integer>> i = s.iterator();
//		while(i.hasNext()) {
//			Entry<Student7, Integer> temp = i.next();
//			System.out.println(temp.getKey().toString() + temp.getValue());
//		}
		
		
	}

}
