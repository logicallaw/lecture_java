abstract class Tmp2{
	public Tmp2() {}
	public abstract void print();
	public void paint() {System.out.println("paint");}
	
}

abstract class Tt extends Tmp2{
	@Override
	public void print() {
		System.out.println("tt | print()");
	}
	
}
public class Ex9 {
	Tt t1 = new Tt();
}
