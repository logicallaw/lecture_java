package default_2;
import java.util.HashMap;
import java.util.Set;
//HashMap->Set->Iterator
class Student4{
	@Override
	public int hashCode() {
		return java.util.Objects.hash(name, birth, height);
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student4) {
			Student4 s = (Student4)obj;
			return name.equals(s.name) && birth.equals(s.birth) && height == s.height;
		}
		else {
			return false;
		}
	}
	@Override
	public String toString() {
		return name + " " + birth + " " + height + " ";
	}
	private String name;
	private String birth;
	private int height;
	public Student4(String name, String birth, int height) {
		this.name = name; this.birth = birth; this.height = height;
	}
}
public class ex12 {
	public static void main(String[] args) {
		HashMap<Student4, Integer> h = new HashMap<Student4, Integer>();
		h.put(new Student4("dlwlrma", "930519", 162), 10000);
		h.put(new Student4("pby", "900212", 158), 15000);
		h.put(new Student4("pby", "000720", 158), 15000);
		h.put(new Student4("dlwlrma", "930519", 162), 20000);
		
		Set<Student4> s = h.keySet();
		java.util.Iterator<Student4> i = s.iterator();
		while(i.hasNext()) {
			Student4 temp = i.next();
			System.out.println(temp.toString() + h.get(temp));
		}
	}

}
