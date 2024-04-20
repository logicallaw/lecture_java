package default_3;
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
		if (tos > -1) 
			return stk[tos--];
		else 
			return null;
	}
	
	@Override
	public boolean push(String str) {
		if (tos < capacity() - 1) {
			stk[++tos] = str;
			return true;
		}
		else {
			return false;
		}
	}
	
	private int tos;
	private String[] stk;
	public StringStack(int size) {
		tos = -1;
		stk = new String[size];
	}
	
}
public class ex4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("size of stack: ");
		int size = scan.nextInt();
		StringStack stk = new StringStack(size);
		System.out.print("input: ");
		String userInput = scan.next();
		while(!userInput.equals("exit")) {
			if (!stk.push(userInput)) 
				System.out.println("stack is full");
			
			System.out.print("input: ");
			userInput = scan.next();
		}
		
		System.out.print("pop all strings: ");

		
		for (int i = 0,length = stk.length(); i < length; i++) {
			System.out.print(stk.pop() + " ");
		}
		
	}

}
