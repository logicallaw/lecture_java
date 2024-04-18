package default_2;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Objects;
class Student1{
	private int id;
	private String tel;
	public Student1(int id, String tel) {
		this.id = id; this.tel = tel;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, tel);
	}
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student1) {
			Student1 s = (Student1)obj;
			return id == s.id && tel.equals(s.tel);
		}
		else {
			return false;
		}
	}
	@Override
	public String toString() {
		return "id:" + id + ", 전화:" + tel;
	}
}
public class ex5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		HashMap<String, Student1> map = new HashMap<String, Student1>();
		map.put("황기태", new Student1(1, "010-111-1111"));
		map.put("이재문", new Student1(2, "010-222-2222"));
		map.put("김남윤", new Student1(3, "010-333-3333"));
		
		System.out.print("검색할 이름?");
		String userInput = scan.next();
		while(!userInput.equals("exit")) {
			if (map.get(userInput) != null) {
				System.out.println(map.get(userInput).toString());
			}
			else {
				System.out.println(userInput + "은 없는 사람입니다.");
			}
			System.out.print("검색할 이름?");
			userInput = scan.next();
		}
		System.out.println("exit");
	}

}
