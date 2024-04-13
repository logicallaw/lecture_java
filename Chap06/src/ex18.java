class Weapon{
	int fire() {
		return 10;
	}
}

class Cannon extends Weapon{
	public int print() {
		return fire();
	}
}

public class ex18 {

	public static void main(String[] args) {
		Cannon c = new Cannon();
		System.out.println(c.print());
	}

}
