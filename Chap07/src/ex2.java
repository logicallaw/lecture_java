import java.util.Vector;
public class ex2 {
	public static void main(String[] args) {
		Vector<Integer> v1 = new Vector<Integer>();
		var v = new Vector<Boolean>();
		v1.add(2); //Integer.valueOf(2)-자동 박싱
		System.out.println(v1.get(0));
	}

}
