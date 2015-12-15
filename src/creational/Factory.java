package creational;

public class Factory {
	public Sender produceSMS() {
		return new SMSsender();
	}
	public Sender produceMAIL() {
		return new MAILsender();
	}
}
