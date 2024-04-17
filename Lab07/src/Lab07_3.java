import java.util.Iterator;
import java.util.Vector;
public class Lab07_3 {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<>();
		v.add(5);
		v.add(4);
		v.add(-1);
		
		v.add(2,100);
		
		System.out.println("벡터 내의 요소 객체 수 : " + v.size());
		System.out.println("벡터의 현재 용량 : " + v.capacity());
		
		Iterator<Integer> i = v.iterator();
		int sum = 0;
		while(i.hasNext()) {
			int element = (i.next()).intValue();
			System.out.println(element);
			sum += element;
		}
		
		System.out.println("sum: " + sum);
	}

}
