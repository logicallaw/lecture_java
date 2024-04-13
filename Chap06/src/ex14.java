import java.util.StringTokenizer;
public class ex14 {
	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("홍길동 장화 홍련 콩쥐 팥쥐", " ");
		while(st.hasMoreTokens())
			System.out.println(st.nextToken());
		String query = "name=kitae&addr=seoul&age=21";
		query = query.split("=");
		StringTokenizer s = new StringTokenizer(query, "&=");
		
		System.out.println(s.nextToken());
		System.out.println(s.nextToken());
	}

}
