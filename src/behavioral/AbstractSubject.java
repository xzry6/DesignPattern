package behavioral;

import java.util.Enumeration;
import java.util.Vector;


public abstract class AbstractSubject implements Subject {
	private Vector<Oberserver> vector = new Vector<Oberserver>();
	@Override
	public void add(Oberserver ob) {
		vector.add(ob);
	}

	@Override
	public void del(Oberserver ob) {
		vector.remove(ob);
	}

	@Override
	public void noOb() {
		Enumeration<Oberserver> enumo = vector.elements();
		while(enumo.hasMoreElements()) enumo.nextElement().update();
	}
}
