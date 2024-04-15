import java.util.*;
public class ex5 {
	public static void main(String[] args) {
		HashMap<String, String> dic = new HashMap<>();
		dic.put("baby", "아기");
		dic.put("nmixx", "엔믹스");
		dic.put("nswer", "엔써");
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.print("찾고 싶은 단어는? ");
			String eng = scan.next();
			if (eng.equals("exit")) {
				break;
			}
			else {
				String kor = dic.get(eng);
				if (kor == null) {
					System.out.println(eng + "는 없는 단어입니다.");
				} else {
					System.out.println(kor);
				}
			}
			
			
		}
	}

}
