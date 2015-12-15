package creational;

public class FactoryTest {
	public static void main(String[] args) {
		Factory factory = new Factory();
		Sender sms = factory.produceSMS();
		Sender mail = factory.produceMAIL();
		sms.send();
		mail.send();
		
		
		Producer producer = new SMSfactory();
		Sender msm = producer.produce();
		msm.send();
	}
}
