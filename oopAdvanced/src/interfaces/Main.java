package interfaces;

public class Main {

	public static void main(String[] args) {
		
		Logger[] loggers = {
				new DatabaseLogger(), 
				new SmsLogger(), 
				new FileLogger(), 
				new EmailLogger() 
				};
		
		CustomerManager customerManager1 = new CustomerManager(loggers);
		Customer emre = new Customer(1, " ismail emre", " gungor");
		customerManager1.add(emre);

	}
}
