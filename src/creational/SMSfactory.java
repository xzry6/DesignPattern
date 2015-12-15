package creational;

public class SMSfactory implements Producer{

	@Override
	public Sender produce() {
		// TODO Auto-generated method stub
		return new SMSsender();
	}
	
}
