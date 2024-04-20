package default_5;
import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;
import java.util.Map;
class Student{
	@Override
	public int hashCode() {
		return java.util.Objects.hash(name, birth, height);
	}
	@Override
	public boolean equals(Object o) {
		if(o instanceof Student) {
			Student s = (Student)o;
			return name.equals(s.name) && birth.equals(s.birth) && height == s.height;
		}
		else {
			return false;
		}
	}
	@Override
	public String toString() {
		return name + " " + birth + " " + height;
	}
	private String name;
	private String birth;
	private int height;
	public Student(String name, String birth, int height) {
		this.name = name; this.birth = birth; this.height = height;
	}
	
}
public class ex1 {
	public static void main(String[] args) {
		HashMap<Student, Integer> map = new HashMap<Student, Integer>();
		map.put(new Student("dlwlrma", "930519", 163), 15000);
		map.put(new Student("pby", "900012", 170), 20000);
		map.put(new Student("pby", "001011", 170), 20000);
		map.put(new Student("dlwlrma", "930519", 163), 20000);
//		for(Student s : map.keySet()) {
//			System.out.println(s + " " + map.get(s));
//		}
//		for(java.util.Map.Entry<Student, Integer> e : map.entrySet()) {
//			System.out.println(e.getKey() + " " + e.getValue());
//		}
//		Set<Student> s = map.keySet();
//		Iterator<Student> i = s.iterator();
//		while(i.hasNext()) {
//			Student temp = i.next();
//			System.out.println(temp + " " + map.get(temp));
//		}
//		Set<Map.Entry<Student, Integer>> s = map.entrySet();
//		Iterator<Map.Entry<Student, Integer>> i = s.iterator();
//		while(i.hasNext()) {
//			Map.Entry<Student, Integer> temp = i.next();
//			System.out.println(temp.getKey() + " " + temp.getValue());
//		}
		
	}

}
