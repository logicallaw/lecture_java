import java.util.*;
class Student{
	int id;
	String tel;
	public Student(int id, String tel) {
		this.id = id; this.tel = tel;
	}
}
public class ex7 {
	public static void main(String[] args) {
		HashMap<String,Student> map = new HashMap<>();
		
		map.put("배진솔", new Student(21, "010-202-3333"));
		map.put("설윤아", new Student(20, "010-372-1293"));
		map.put("오해원", new Student(21, "010-212-9983"));
		
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.print("검색할 이름?");
			String name = scan.next();
			if (name.equals("exit")) {
				break;
			}
			else {
				Student student = map.get(name);
				if (student == null) {
					System.out.println(name + " 은(는) 없는 사람입니다.");
				}
				else {
					System.out.println("id: " + student.id + ", tel: " + student.tel);
					
				}
			}
		}
		scan.close();
		
	}

}
