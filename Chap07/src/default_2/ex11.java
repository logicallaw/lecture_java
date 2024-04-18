package default_2;
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
		return tos + 1;
	}
	@Override
	public int capacity() {
		return stk.length;
	}
	@Override
	public String pop() {
		if (tos >= 0) {
			return stk[--tos];
		}
		else {
			return null;
		}
	}
	@Override
	public boolean push(String str) {
		if (tos < stk.length) {
			stk[tos++] = str;
			return true;
		}
		else {
			return false;
		}
	}
	private int tos;
	private String[] stk;
	public StringStack(int size) {
		stk = new String[size];
		tos = 0;
	}
	
}
public class ex11 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("size of stack: ");
		int size = scan.nextInt();
		StringStack stack = new StringStack(size);
		
		System.out.print("input: ");
		String userInput = scan.next();
		while(!userInput.equals("exit")) {
			if (stack.length() - 1 != stack.capacity()) {
				stack.push(userInput);
			}
			else {
				System.out.println("stack is full!");
			}
			System.out.print("input: ");
			userInput = scan.next();
		}
		
		System.out.print("pop all strings: ");
		for (int i = 0; i < stack.capacity(); i++) {
			System.out.print(stack.pop() + " ");
		}
		scan.close();
		
	}

}
