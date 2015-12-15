package structural;

public class Decorator implements Targetable{
	private Targetable cooler;
	public Decorator(Targetable cooler) {
		super();
		this.cooler = cooler;
	}
	public void method1() {
		cooler.method1();
	}
	public void method2() {
		cooler.method1();
	}
	public void method() {
		System.out.println("before cooler");
		method1();
		method2();
		System.out.println("after cooler");
	}
}
