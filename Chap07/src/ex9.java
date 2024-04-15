import java.util.*;
class Tmp2<T>{
	T a;
	public Tmp2() {}
	void set(T a) {
		this.a = a;
	}
	T get() { return a; }
}
public class ex9 {
	public static void main(String[] args) {
		Tmp2<String> t2 = new Tmp2<>();
		System.out.println(t2.get());
	}

}
