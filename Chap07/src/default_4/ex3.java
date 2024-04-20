package default_4;
import java.util.Vector;
import java.util.Scanner;
public class ex3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("size: ");
		int size = scan.nextInt();
		System.out.print("capacity: ");
		int capacity = scan.nextInt();
		Vector<Integer> v = new Vector<Integer>(capacity);
		int sum = 0;
		
		for (int i = 0; i < size; i++) {
			int temp = scan.nextInt();
			v.add(Integer.valueOf(temp));
		}
		
		java.util.Iterator<Integer> i = v.iterator();
		while(i.hasNext()) {
			sum += i.next();
		}
		System.out.println("sum: " + sum);
	}

}
