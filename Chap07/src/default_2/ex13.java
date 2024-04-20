package default_2;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Vector;
import java.util.Iterator;
//HashMap->Entry<K,V> for-each문
class Student5{
	@Override
	public int hashCode() {
		return java.util.Objects.hash(name, birth, height);
	}
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student5) {
			Student5 s = (Student5)obj;
			return name.equals(s.name) && birth.equals(s.birth) && height == s.height;
		}
		else {
			return false;
		}
	}
	@Override
	public String toString() {
		return name + " " + birth + " " + height;
	}
	private String name;
	private String birth;
	private int height;
	public Student5(String name, String birth, int height) {
		this.name = name; this.birth = birth; this.height = height;
	}
}
public class ex13 {
	public static void main(String[] args) {
		Vector<Student5> v1 = new Vector<>();
		v1.add(new Student5("dlwlrma", "930519", 162));
		v1.add(new Student5("pby", "000720", 158));
		v1.add(new Student5("pby", "900212", 158));
		Iterator<Student5> i = v1.iterator();
		
		while(i.hasNext()) {
			Student5 temp = i.next();
			System.out.println(temp);
		}
	}

}
