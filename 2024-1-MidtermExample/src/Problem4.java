import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
public class Problem4 {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("dlwlrma", 95);
		map.put("pby", 95);
		map.put("wooklee", 27);
		Set<Entry<String, Integer>> set = map.entrySet();
		//여기에다 코드를 추가한다.
		Iterator<Entry<String, Integer>> i = set.iterator();
		while(i.hasNext()) {
			Entry<String, Integer> temp = i.next();
			System.out.println(temp.getKey() + ": " + temp.getValue());
		}
	}
}
