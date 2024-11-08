class Student{
	private String name;
	private int birth;
	
	Student(String name, int birth){
		this.name = name;
		this.birth = birth;
	}
	boolean isOlder(Student other) {
		return (birth < other.birth) ? true : false;
	}
	String getName() {
		return name;
	}
	
}
public class Lab04_2 {
	public static void printInfor(Student a, Student b) {
		System.out.println(
				a.isOlder(b)
					? (a.getName() + " > " + b.getName()) 
					: (a.getName() + " <= " + b.getName())
					);
	}
	
	public static void main(String[] args) {
		Student s1 = new Student("pby", 19900212);
		Student s2 = new Student("dlwlrma", 19930516);
		Student s3 = new Student("JianLee", 19981104);
		printInfor(s1, s2);
		printInfor(s3, s2);
	}
}
