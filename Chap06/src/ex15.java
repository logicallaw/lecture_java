class Tmp34{
	public Tmp34() {}
	int a = 5;
}
class Tmp33 extends Tmp34{
	public Tmp33() {}
	public int getN() { return 10; }
}
public class ex15 {
	public static void main(String[] args) {
		Tmp34 t = new Tmp33();
		t.a = 10;
		t.getN();
	}

}
