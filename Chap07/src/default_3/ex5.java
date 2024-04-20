package default_3;
import java.util.Scanner;
class Student2{
	private String name;
	private String birth;
	public Student2(String name, String birth) {
		this.name = name; this.birth = birth;
	}
	public void printInfor() {
		System.out.println(name + " " + birth);
	}
}
public class ex5 {
	static Scanner scan = new Scanner(System.in);
	static void closeScanner() { scan.close(); }
	public static Student2[] makeArray(int number) {
		Student2[] temp = new Student2[number];
		for (int i = 0; i < number; i++) {
			System.out.print("Enter your name and birth: ");
			String name = scan.next();
			String birth = scan.next();
			temp[i] = new Student2(name, birth);
		}
		return temp;
	}
	public static void printArray(Student2[] s) {
		for (Student2 element : s) {
			element.printInfor();
		}
	}
	public static void main(String[] args) {
		int number;
		System.out.print("Enter #students: ");
		number = scan.nextInt();
		Student2[] sArr = makeArray(number);
		System.out.println();
		printArray(sArr);
		ex5.closeScanner();
	}

}
