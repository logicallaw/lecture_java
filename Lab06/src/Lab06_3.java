import java.util.Objects;
import java.lang.*;
class Student{
	/*
	Overriding
	-hashCode() of Object class.
	-equals() of Object class.
	*/
	@Override 
	public int hashCode() {
		return Objects.hash(number, name); //field1:number, field2:name
	}
	@Override
	public boolean equals(Object obj) { 
		if (obj instanceof Student) {
			return number == ((Student)obj).number || name.equals(((Student)obj).name);
		}
		return false;
	}
	//Field
	private int number;
	private String name;
	//Constructor
	public Student(int number, String name) {
		this.number = number;
		this.name = name;
	}
	//Getter:You can get the private field values
//	public int getNumber() { return number; }
//	public String getName() { return name; }
	
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