package creational;

public class SingleTon {
	private static SingleTon single = null;
	private SingleTon() {
		
	}
	public static SingleTon getInstance() {
		if(single==null) {
			synchronized(SingleTon.class) {
				if(single==null) single = new SingleTon();
			}
		}
		return single;
	}
}
