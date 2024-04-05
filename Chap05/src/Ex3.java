//class Person{
//	String name;
//	String id;
//	
//	public Person(String name) {
//		this.name = name;
//	}
//}
//
//class Student extends Person{ //Person을 상속받은 자식클래
//	String grade;
//	String department;
//	
//	public Student(String name) {
//		super(name); //자식클래스 
//	}
//	
//	
//}
//
//
//public class Ex3 {
//
//	public static void main(String[] args) {
//		Person p;
//		Student s = new Student("junho");
//		s.grade = "aa";
//		p = s; //업캐스팅
//		s = (Student)p;
//		s.grade = "ss";
//		
//		System.out.println(p.name);
////		p.grade = "j";
////		p.department = "hi";
//	}
//
//}
