import java.util.Scanner;
abstract class Stack{
	public abstract int length();
	public abstract int capacity();
	public abstract String pop();
	public abstract boolean push(String str);
}

class StringStack extends Stack{
	@Override
	public int length() {
		return tos;
	}
	@Override
	public int capacity() {
		return stack.length;
	}
	@Override
	public String pop() {
		if (tos >= 0) {
			return stack[--tos];
		}
		return null;
	}
	@Override
	public boolean push(String str) {
		if (tos < stack.length) {
			stack[tos++] = str;
			return true;
		}
		else {
			return false;
		}
	}
	
	//Field
	private String[] stack;
	private int tos;
	//Constructor
	public StringStack(int size) {
		stack = new String[size];
		tos = 0;
	}
	//Method
}
public class Lab05_3 {
	static Scanner scan = new Scanner(System.in);
	public static void closeScanner() {
		scan.close();
	}
	public static void main(String[] args) {
		System.out.print("size of stack: ");
		int size = scan.nextInt();
		StringStack stk = new StringStack(size);
		
		System.out.print("input: ");
		String inputMessage = scan.next();
		while(!inputMessage.equals("exit")) {
			if (!stk.push(inputMessage)) {
				System.out.println("stack is full!");
			}
			System.out.print("input: ");
			inputMessage = scan.next();
		}
		
		System.out.print("pop all things: ");
		for (int i = 0; i < stk.capacity(); i++) {
			System.out.print(stk.pop() + " ");
		}
		Lab05_3.closeScanner();
	}
}