package interfaces;

public class CustomerManager {
	
	private Logger[] loggers;	
	
	public CustomerManager(Logger[] loggers) {
		this.loggers = loggers;
	}

	//Loosly - tightly coupled
	public void add(Customer customer) {
		System.out.println("Müsteri eklendi. "+customer.getFirstName());
		
		Utils.runLoggers(loggers, customer.getFirstName());
		
//		for(Logger logger:loggers) {
//			logger.log(customer.getFirstName());
//		}
		
		
//		Dizi ekliyoruz loggers olmaz.
//		this.logger.log(customer.getFirstName()); 
		
		//Kötü programla örneði - Katý baðýmlýlýk
//		DatabaseLogger logger = new DatabaseLogger();
//		logger.log(customer.getFirstName() + " veri tabanýna loglandý");
	}
	
	public void delete(Customer customer) {
		System.out.println("Müsteri silindi. "+customer.getFirstName());
		
		Utils.runLoggers(loggers, customer.getLastName());
		
//		for(Logger logger:loggers) {
//			logger.log(customer.getFirstName());
//		}
		
//		this.logger.log(customer.getFirstName());
//		DatabaseLogger logger = new DatabaseLogger();
//		logger.log(customer.getFirstName() + " veri tabanýna loglandý");
	}

	
}
