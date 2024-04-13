
public class StringEx {
	public static void main(String[] args) {
		String a = new String(" #C");
		String b = new String(",C++ ");
		System.out.println(a + "의 길이는 " + a.length()); // #C의 길이는 3
		System.out.println(a.contains("#"));//true
		
		a = a.concat(b);// #C,C++ 
		System.out.println(a);
		
		a.trim();
	
		
		//a = a.replace("C#","Java"); // Java,C++ 
		
	}

}
