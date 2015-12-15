package structural;

public class AdapterTest {
	public static void main(String[] args) {
		Targetable target = new Adapter();
		target.method1();
		target.method2();
		
		Source source = new Source();
		Targetable target2 = new Wrapper(source);
		target2.method1();
		target2.method2();
		
		Targetable sub1 = new Sub1();
		Targetable sub2 = new Sub2();
		sub1.method1();
		sub1.method2();
		sub2.method1();
		sub2.method2();
		
		Targetable cooler = new Cooler();
		Decorator decorate = new Decorator(cooler);
		decorate.method();
	}
}
