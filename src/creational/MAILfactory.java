package creational;

public class MAILfactory implements Producer{

	@Override
	public Sender produce() {
		// TODO Auto-generated method stub
		return new MAILsender();
	}
	
}
