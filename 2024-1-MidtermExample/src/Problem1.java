import java.util.*;
class Person{
	private int age;
	private String name;
	public Person(int age, String name) {
		this.age = age;
		this.name = name;
	}
	//구현
	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}
	@Override
	public boolean equals(Object o) {
		if(o instanceof Person) {
			Person s = (Person)o;
			return age == s.age && name == s.name;
		}
		else {
			return false;
		}
	}
}
public class Problem1 {
	public static void main(String[] args) {
		HashSet<Person> set = new HashSet<Person>();
		set.add(new Person(27, "dlwlrma"));
		set.add(new Person(27, "dlwlrma"));
	}

}
