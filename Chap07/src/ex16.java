import java.lang.StringBuffer;
import java.util.Scanner;
public class ex16 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String message = scan.nextLine();
		StringBuffer sb = new StringBuffer(message);
		System.out.println(message);
		message = "jd";
		System.out.println(message);
		
		scan.close();
	}
}
