class GStack<T>{
	int tos;
	Object[] stck;
	public GStack() {
		tos = 0;
		stck = new Object[10];
	}
	public void push(T item) {
		if (tos == 10) {
			return;
		}
		stck[tos++] = item;
	}
	public T pop() {
		if (tos == 0) {
			return null;
		}
		tos--;
		return (T)stck[tos];
	}
}
class GenericMethodEx{
	static <T> void toStack(T[] a, GStack<T> gs) {
		for (int i = 0; i < a.length; i++) {
			gs.push(a[i]);
		}
	}
}
public class ex10 {
	public static void main(String[] args) {
		GStack<String> stringStack = new GStack<String>();
		stringStack.push("seoul");
		stringStack.push("busan");
		stringStack.push("LA");
		
		for (int n = 0;n<3;n++) {
			System.out.println(stringStack.pop());
		}
		
		GStack<Integer> intStack = new GStack<Integer>();
		intStack.push(1);
		intStack.push(3);
		intStack.push(5);
		for(int n=0; n<3; n++)
			System.out.println(intStack.pop());
		
		Object[] oArray = new Object[100];
		GStack<Object> objectStack = new GStack<Object>();
		GenericMethodEx.toStack(oArray, objectStack); // 타입 매개변수 T를 Object로 유추함
		
	}

}
