package structural;

public class Adapter extends Source implements Targetable{
	@Override
	public void method2() {
		System.out.println("the second method");
	}
}
