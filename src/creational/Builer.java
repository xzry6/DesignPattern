package creational;

public class Builer {
	private boolean a1;
	private boolean a2;
	private boolean a3;
	public Builer() {
		
	}
	public Builer setA1(boolean flag) {
		a1 = flag;
		return this;
	}
	public Builer setA2(boolean flag) {
		a2 = flag;
		return this;
	}
	public Builer setA3(boolean flag) {
		a3 = flag;
		return this;
	}
	public Builer build() {
		return new Builer();
	}
}
