package default_2;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Iterator;
import java.util.Set;
public class ex14 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("오해원", 200);
		map.put("배진솔", 300);
		System.out.print("입력하세요: ");
		String userInput = scan.next();
		while(!userInput.equals("exit")) {
			if (map.get(userInput) != null) {
				System.out.println(userInput + ": " + map.get(userInput));
			}
			else {
				System.out.println(map.get(userInput));
				System.out.println(userInput + " 이(가) 존재하지 않습니다.");
			}
			System.out.println("(종료를 원한다면 exit을 입력해주세요.)");
			System.out.print("입력하세요: ");
			userInput = scan.next();
		}
	}

}
