package default_4;
import java.util.Objects;
class Student1{
	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}
	@Override
	public boolean equals(Object o) {
		if (o instanceof Student1) {
			Student1 s = (Student1)o;
			return id == s.id && name.equals(s.name);
		}
		else {
			return false;
		}
	}
	private int id;
	private String name;
	public Student1(int id, String name) {
		this.id = id; this.name = name;
	}
}
public class ex5 {
	public static void main(String[] args) {
		Student1 s1 = new Student1(16, "dlwlrma");
		Student1 s2 = new Student1(16, "dlwlrma");
		
		if (s1.hashCode() == s2.hashCode() && s1.equals(s2)) {
			System.out.println("s1 == s2");
		}
		else {
			System.out.println("s1 != s2");
		}
	}

}
