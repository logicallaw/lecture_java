//import java.util.Scanner;
//abstract class Stack{
//	public abstract int length();
//	public abstract int capacity();
//	public abstract String pop();
//	public abstract boolean push(String str);
//}
///* You mush redefine All abstract methods.
// * public int length()
// * public int capacity()
// * public String pop()
// * public boolean push(String str)
// */
//class StringStack extends Stack{
//	//private fields.
//	private int tos;
//	private String[] stk;
//	//constructor
//	public StringStack(int size) {
//		stk = new String[size];
//		tos = 0;
//	}
//	@Override
//	public int length() {
//		return tos;
//	}
//	@Override
//	public int capacity() {
//		return stk.length;
//	}
//	@Override
//	public String pop() {
//		if (tos >= 0) {
//			return stk[--tos];
//		}
//		else {
//			return null;
//		}
//	}
//	//
//	@Override //3, 1,2,3
//	public boolean push(String str) {
//		if (tos < stk.length) {
//			stk[tos++] = str;
//			return true;
//		}
//		else {
//			return false;
//		}
//	}
//}
//public class Lab05_3 {
//	static Scanner scan = new Scanner(System.in);
//	public static void closeScanner() { scan.close(); }
//	public static void main(String[] args) {
//		System.out.print("size of stack: ");
//		int size = scan.nextInt();
//		StringStack stk1 = new StringStack(size);
//		
//		System.out.print("input: ");
//		String inputMessage = scan.next();
//		while(!inputMessage.equals("exit")) {
//			if (!stk1.push(inputMessage)) {
//				System.out.println("stack is full!");
//			}
//			System.out.print("input: ");
//			inputMessage = scan.next();
//		}
//		System.out.print("pop all strings: ");
//		for(int i = 0; i < stk1.capacity(); i++) {
//			System.out.print(stk1.pop() + " ");
//		}
//		
//		Lab05_3.closeScanner();
//	}
//
//}
