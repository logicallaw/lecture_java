class Tmp11{
	public Tmp11() {}
	public Tmp11 sub(int n) {
		a += n;
		return this;
	}
	public Tmp11 minus(int n) {
		a -= n;
		return this;
	}
	int a = 10;
}
public class ex22 {
	public static void main(String[] args) {
		Tmp11 t1 = new Tmp11();
		Tmp11 tt = t1.sub(5).minus(11);
		Integer i1 = Integer.parseInt("12");
		String ss = i1.toString();
		System.out.println(i1.intValue());
	}

}
