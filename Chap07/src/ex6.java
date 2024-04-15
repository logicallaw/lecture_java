import java.util.*;
import java.util.Map.Entry;
public class ex6 {
	public static void main(String[] args) {
		//사용자 이름과 정수를 저장하는 HashMap 컬렉션 리턴
		HashMap<String, Integer> javaScores = new HashMap<>();
		javaScores.put("김지우", 60);
		javaScores.put("오해원", 80);
		javaScores.put("배진솔", 70);
		javaScores.put("설윤아", 55);
		javaScores.put("장규진", 89);
		javaScores.put("릴리", 98);
		
		System.out.println("HashMap의 요소의 개수: " + javaScores.size());
		//key 문자열을 가진 Set 컬렉션 리턴
		Set<String> keys = javaScores.keySet();
		//key 문자열을 순서대로 접근할 수 있는 Iterator 리턴
		Iterator<String> it = keys.iterator();
		
		
		while(it.hasNext()) {
			String name = it.next();
			int score = javaScores.get(name);
			System.out.println(name + ": " + score);
		}
		System.out.println();
		for (String s : javaScores.keySet()) {
			System.out.println(s + ": " + javaScores.get(s));
		}
		System.out.println();
		for (Entry<String, Integer> e : javaScores.entrySet()) {
			System.out.println(e.getKey() + ": " + e.getValue());
		}
		
	}

}
