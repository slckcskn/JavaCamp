package polymorphisimDemo_38;

public class Main {

	public static void main(String[] args) {
		
//		EmailLogger logger = new EmailLogger();
//		logger.log("Log Mesajý");
		
//		BaseLogger[] loggers = new BaseLogger[] {new FileLogger(),new EmailLogger(),new DatabaseLogger(),new ConsoleLogger()};
//		for (BaseLogger logger:loggers) {
//			logger.log("Log Mesajý");
//		}
		
		CustomerManager customerManager= new CustomerManager(new FileLogger());
		customerManager.add();
		
		
		
	}

}
