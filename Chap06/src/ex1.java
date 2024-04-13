class Tmp{
	public Tmp() {}
}
public class ex1 {
	public static void main(String[] args) {
		Tmp obj = new Tmp();
		
		System.out.println(obj.getClass()); //toString()으로 변환하여 출력
		System.out.println(obj);
	}

}
