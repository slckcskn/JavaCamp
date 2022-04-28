package interfaces_42;

public class CustomerManager {
	
	//Birinci ama kullanýþlý olmayan yol.
	private ICustomerDal customerDal;
	
	public CustomerManager(ICustomerDal customerDal) {
		this.customerDal = customerDal;
	}
	
	// iþ kodlarý yazýlýr
	public void add() {
		customerDal.add();
	}
	
}
