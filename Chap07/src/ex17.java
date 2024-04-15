import java.util.StringTokenizer;
import java.util.Scanner;
public class ex17 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String message = scan.nextLine();
		StringTokenizer st = new StringTokenizer(message, " ");
		System.out.println(st.countTokens());
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}

}
