import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Objects;

class Student{
	//field
	private String name;
	private String birth;
	private int height;

	//constructor
	public Student(String name, String birth, int height) {
		this.name = name; this.birth = birth; this.height = height;
	}
	@Override
	public String toString() {
		return name + " " + birth + " " + height + " ";
	}
	//HashMap의 올바른 동작을 위한 hashCode(), equals() 메서드 오버라이딩이 필요하다.
	@Override
	public int hashCode() {
		return Objects.hash(name, birth, height);
	}
	@Override
	public boolean equals(Object o) {
		Student s = (Student)o;
		return name == ((Student)o).name && birth == ((Student)o).birth && height == ((Student)o).height;
//		return name.equals(s.name) && birth.equals(s.birth) && height == s.height;
	}
}
public class Lab07_4 {
	public static void main(String[] args) {
		HashMap<Student, Integer> h = new HashMap<>();
		h.put(new Student("dlwlrma", "930516", 162), 10000);
		h.put(new Student("pby", "900212", 158), 15000);
		h.put(new Student("pby", "000720", 158), 15000);
		h.put(new Student("dlwlrma", "930516", 162), 20000);
		//먼저, key.hashCode()로 해시값을 얻어와서 
		//동일 key에 대한 새로운 value로 HashMap을 업데이트한다. 
		
//		for (Student s : h.keySet()) 
//			System.out.println(s.toString() + h.get(s));
		for (Entry<Student, Integer> e : h.entrySet()) 
			System.out.println(e.getKey().toString() + e.getValue());
	}
}
//
//import java.util.HashMap;
//import java.util.Objects;
//import java.util.Map.Entry;
//class Student{
//	private String name;
//	private String birth;
//	private int height;
//	public Student(String name, String birth, int height){
//		this.name = name; this.birth = birth; this.height = height;
//	}
//	@Override
//	public int hashCode(){
//		return Objects.hash(name, birth, height); 
//		}
//	@Override
//	public boolean equals(Object obj){
//		Student s = (Student)obj;
//		return name == s.name && birth == s.birth && height == s.height;
//	}
//	@Override
//	public String toString(){
//		return name + " " + birth + " " + height + " "; 
//	}
//}
//public class Lab07_4{
//		public static void main(String[] args){
//		HashMap<Student, Integer> h = new HashMap<Student, Integer>();
//		h.put(new Student("dlwlrma", "930516", 162), 15000);
//		h.put(new Student("pby", "900212", 158), 15000);
//		h.put(new Student("pby", "000720", 158), 15000);
//		h.put(new Student("dlwlrma", "930516", 162), 20000);
//
//		for(Entry<Student, Integer> e : h.entrySet()){
//			System.out.println(e.getKey().toString() + e.getValue());
//		}
//	}
//
//}