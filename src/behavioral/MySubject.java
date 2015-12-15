package behavioral;

public class MySubject extends AbstractSubject{

	@Override
	public void operation() {
		System.out.println("operate now");
		noOb();
	}
	
}
