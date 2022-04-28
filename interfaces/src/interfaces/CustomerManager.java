package interfaces;

public class CustomerManager {
	
	private Logger[] loggers;	
	
	public CustomerManager(Logger[] loggers) {
		this.loggers = loggers;
	}

	//Loosly - tightly coupled
	public void add(Customer customer) {
		System.out.println("M�steri eklendi. "+customer.getFirstName());
		
		Utils.runLoggers(loggers, customer.getFirstName());
		
//		for(Logger logger:loggers) {
//			logger.log(customer.getFirstName());
//		}
		
		
//		Dizi ekliyoruz loggers olmaz.
//		this.logger.log(customer.getFirstName()); 
		
		//K�t� programla �rne�i - Kat� ba��ml�l�k
//		DatabaseLogger logger = new DatabaseLogger();
//		logger.log(customer.getFirstName() + " veri taban�na logland�");
	}
	
	public void delete(Customer customer) {
		System.out.println("M�steri silindi. "+customer.getFirstName());
		
		Utils.runLoggers(loggers, customer.getLastName());
		
//		for(Logger logger:loggers) {
//			logger.log(customer.getFirstName());
//		}
		
//		this.logger.log(customer.getFirstName());
//		DatabaseLogger logger = new DatabaseLogger();
//		logger.log(customer.getFirstName() + " veri taban�na logland�");
	}

	
}
