package behavioral;

public class BehaviorTest {
	public static void main(String[] args) {
		Oberserver ob1 = new Ob1();
		Oberserver ob2 = new Ob2();
		Subject mysub = new MySubject();
		mysub.add(ob1);
		mysub.add(ob2);
		mysub.operation();
	
		Animal animal = new Panda();
		Iterator it = animal.iterator();
		while(it.hasNext()) System.out.println(it.next());
	
	
	}
}
