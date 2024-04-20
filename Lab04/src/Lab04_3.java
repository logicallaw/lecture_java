import java.util.Scanner;
class Student2{
	//field
	private String name;
	private int birth;
	
	//constructor
	public Student2() {}
	public Student2(String name, int birth) {
		this.name = name;
		this.birth = birth;
	}
	
	//method
	public void printlnfor() {
		System.out.println(name + " " + birth);
	}
}


public class Lab04_3 {
	static Scanner scan = new Scanner(System.in);
	static void closeScanner() {
		scan.close();
	}
	
	public static Student2[] makeArray(int number) {
		//declare name, birth, Student2 array.
		String name;
		int birth;
		Student2[] arr = new Student2[number];
		
		//input name and birth.
		//create Student2 object by using parameter constructor.
		for (int i = 0; i < number; i++) {
			System.out.print("Enter your name and birth: ");
			name = scan.next();
			birth = scan.nextInt();
			arr[i] = new Student2(name, birth);
		}
		
		return arr;
	}
	
	public static void printArray(Student2[] param) {
		//print name and birth by using for-loop.
		for (Student2 element : param) {
			element.printlnfor();
		}
	}
	
	public static void main(String[] args) {
		int number;
		System.out.print("Enter #students: ");
		number = scan.nextInt();
		Student2[] sArr = makeArray(number);
		System.out.println();
		printArray(sArr);
		Lab04_3.closeScanner();
	}

}
