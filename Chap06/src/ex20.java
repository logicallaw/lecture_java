import java.lang.StringBuffer;
public class ex20 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("a");
		System.out.println(sb);
		sb.append(" pencil");
		System.out.println(sb);
		sb.insert(2, "nice ");
		System.out.println(sb);
		sb.replace(2,6,"bad");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		int n = sb.length();
		System.out.println(n);
		System.out.println(sb.charAt(2));
		sb.setLength(3);
		System.out.println(sb);
	}
}
