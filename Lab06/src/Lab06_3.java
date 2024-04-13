import java.util.Objects;
import java.lang.*;
class Student extends Object{
	private int number;
	private String name;
	public Student(int number, String name) {
		this.number = number;
		this.name = name;
	}
	public int getNumber() { return number; }
	public String getName() { return name; }
	@Override
	public int hashCode() { //overriding-Object class
		int hashCode = Objects.hash(number, name); //field1:number, field2:name
		return hashCode;
	}
	@Override
	public boolean equals(Object obj) {
		//If obj is Student class...
		if (obj instanceof Student) {
			if (number == ((Student)obj).getNumber() || name.equals(((Student)obj).getName()))
				return true;
			else
				return false;
		}
		else {
			return false;
		}
	}
}
public class Lab06_3 {
	public static void main(String[] args) {
		Student s1 = new Student(16, "dlwlrma");
		Student s2 = new Student(16, "dlwlrma");
		
		if (s1.hashCode() == s2.hashCode()) {
			if (s1.equals(s2)) {
				System.out.println("s1 == s2");
			}
			else {
				System.out.println("s1 != s2");
			}
		}
		else {
			System.out.println("s1 != s2");
		}
	}
}