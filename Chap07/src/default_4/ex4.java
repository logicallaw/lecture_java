package default_4;
import java.util.HashMap;
class Student{
	@Override
	public int hashCode() {
		return java.util.Objects.hash(name, birth, height);
	}
	@Override
	public boolean equals(Object o) {
		if (o instanceof Student) {
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
public class ex4 {
	public static void main(String[] args) {
		HashMap<Student, Integer> map = new HashMap<Student, Integer>();
		map.put(new Student("dlwlrma", "930519", 162), 10000);
		map.put(new Student("pby", "900212", 158), 15000);
		map.put(new Student("pby", "000720", 158), 15000);
		map.put(new Student("dlwlrma", "930519", 162), 20000);
		
		//for-each Entry
//		for (java.util.Map.Entry<Student, Integer> e : map.entrySet()) {
//			System.out.println(e.getKey() + " " + e.getValue());
//		}
		//for-each key
//		for (Student s : map.keySet()) {
//			System.out.println(s + " " + map.get(s));
//		}
		
		//Entry-Iterator
//		java.util.Set<java.util.Map.Entry<Student, Integer>> s = map.entrySet();
//		java.util.Iterator<java.util.Map.Entry<Student, Integer>> i = s.iterator();
//		while(i.hasNext()) {
//			java.util.Map.Entry<Student, Integer> temp = i.next();
//			System.out.println(temp.getKey() + " " + temp.getValue());
//		}
		
		//key랑 Iterator
//		java.util.Set<Student> s = map.keySet();
//		java.util.Iterator<Student> i = s.iterator();
//		while(i.hasNext()) {
//			Student temp = i.next();
//			System.out.println(temp + " " + map.get(temp));
//		}
		
	}
}
