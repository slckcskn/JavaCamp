package polymorphisimDemo_38;

public class CustomerManager {

	private BaseLogger logger;

	public CustomerManager(BaseLogger logger) {
		this.logger = logger;
	}

//	public CustomerManager(DatabaseLogger logger) {
//		
//	}
	public void add() {
		System.out.println("M��teri eklendi.");
		this.logger.log("log Mesaj�");

		// Bir classta ba�ka bir class new'lendiyse k�r� k�r�ne DatabaseLogger'a
		// ba�lanm�� olur.
//		DatabaseLogger logger = new DatabaseLogger();
//		logger.Log("Log mesaj�.");
	}

}
