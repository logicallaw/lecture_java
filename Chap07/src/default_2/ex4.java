package default_2;
import java.util.HashMap;
import java.util.Objects;
import java.util.Iterator;
import java.util.Set;
import java.util.Map.Entry;
class Student{
	private String name;
	private String birth;
	private int height;
	public Student(String name, String birth, int height) {
		this.name = name; this.birth = birth; this.height = height;
	}
	@Override
	public int hashCode() {
		return Objects.hash(name, birth, height);
	}
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student s = (Student)obj;
			return name == s.name && birth == s.birth && height == s.height;
		}
		else {
			return false;
		}
	}
	@Override
	public String toString() {
		return name + " " + birth + " " + height + " ";
	}
}
public class ex4 {
	public static void main(String[] args) {
		HashMap<Student, Integer> h = new HashMap<Student, Integer>();
		h.put(new Student("dlwlrma", "930519", 162), 10000);
		h.put(new Student("pby", "900212", 158), 15000);
		h.put(new Student("pby", "000720", 158), 15000);
		h.put(new Student("dlwlrma", "930519", 162), 20000);
		
//		for (Entry<Student, Integer> e : h.entrySet()) {
//			System.out.println(e.getKey().toString() + e.getValue());
//		}
		
//		Set<Student> s = h.keySet();
//		Iterator i = s.iterator();
//		while(i.hasNext()) {
//			Student temp = (Student)(i.next());
//			System.out.println(temp.toString() + h.get(temp));
//		}
		
//		for (Student s : h.keySet()) {
//			System.out.println(s.toString() + h.get(s));
//		}
	}

}
