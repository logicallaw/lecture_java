package default_2;
import java.util.Objects;
class Student3{
	private int number;
	private String name;
	public Student3(int number, String name) {
		this.number = number; this.name = name;
	}
	@Override
	public int hashCode() {
		return Objects.hash(number, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student3) {
			Student3 s = (Student3)obj;
			return number == s.number && name.equals(s.name);
		} else {
			return false;
		}
	}
	
}
public class ex7 {

	public static void main(String[] args) {
		Student3 s1 = new Student3(16, new String("dlwlrma"));
		Student3 s2 = new Student3(16, new String("dlwlrma"));
		if (s1.hashCode() == s2.hashCode() && s1.equals(s2)) {
			System.out.println("s1 == s2");
		}
		else {
			System.out.println("s1 != s2");
		}
		
	}

}
