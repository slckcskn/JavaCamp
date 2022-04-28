package interfaces_42;

public class CustomerManager {
	
	//Birinci ama kullan��l� olmayan yol.
	private ICustomerDal customerDal;
	
	public CustomerManager(ICustomerDal customerDal) {
		this.customerDal = customerDal;
	}
	
	// i� kodlar� yaz�l�r
	public void add() {
		customerDal.add();
	}
	
}
