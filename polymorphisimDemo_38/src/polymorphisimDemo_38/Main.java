package polymorphisimDemo_38;

public class Main {

	public static void main(String[] args) {
		
//		EmailLogger logger = new EmailLogger();
//		logger.log("Log Mesaj�");
		
//		BaseLogger[] loggers = new BaseLogger[] {new FileLogger(),new EmailLogger(),new DatabaseLogger(),new ConsoleLogger()};
//		for (BaseLogger logger:loggers) {
//			logger.log("Log Mesaj�");
//		}
		
		CustomerManager customerManager= new CustomerManager(new FileLogger());
		customerManager.add();
		
		
		
	}

}
