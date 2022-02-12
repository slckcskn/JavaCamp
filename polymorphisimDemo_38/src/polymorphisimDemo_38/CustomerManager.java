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
		System.out.println("Müþteri eklendi.");
		this.logger.log("log Mesajý");

		// Bir classta baþka bir class new'lendiyse körü körüne DatabaseLogger'a
		// baðlanmýþ olur.
//		DatabaseLogger logger = new DatabaseLogger();
//		logger.Log("Log mesajý.");
	}

}
