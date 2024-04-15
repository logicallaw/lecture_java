import java.util.Vector;
class Tmp{
	public Tmp() {
		b++;
	}
	public static int b = 0;
}
public class ex1 {
	public static void fun(Vector<Tmp> t) {
		for (int i = 0; i < 20; i++) {
			t.add(0,new Tmp());
		}
		for (int i = 0; i < t.size(); i++) {
			System.out.println(t.get(i).b);
		}

	}
	public static void main(String[] args) {
		Vector<Tmp> v1 = new Vector<Tmp>();
		fun(v1);
		System.out.println(v1.size());
		System.out.println(v1.capacity());
		Integer a = Integer.valueOf(122);
		System.out.println(a); //.intValue()
		System.out.println(a.intValue());
	}

}
