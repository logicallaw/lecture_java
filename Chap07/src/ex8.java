import java.util.*;
public class ex8 {
	public static void printList(LinkedList<String> I) {
		Iterator<String> iterator = I.iterator();
		while(iterator.hasNext()) {
			String e = iterator.next();
			String separator;
			if (iterator.hasNext()) {
				separator = "->";
			}
			else {
				separator = "\n";
			}
			System.out.print(e + separator);
		}
	}
	public static void main(String[] args) {
		LinkedList<String> myList = new LinkedList<>();
		myList.add("엔믹스");
		myList.add("아일릿");
		myList.add("르세라핌");
		myList.add(0,"아이브");
		myList.add(1,"뉴진스");
		
		Collections.sort(myList);
		printList(myList);
		
		Collections.reverse(myList);
		printList(myList);
		
		int index = Collections.binarySearch(myList, "엔믹스") + 1;
		System.out.println("엔믹스는 " + index + "번째 요소에 있습니다.");
		
		
		
	}
}
