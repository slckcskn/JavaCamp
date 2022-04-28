package interfaces_42;

public class Main {

	public static void main(String[] args) {

		//Bir class birden fazla interface i implemente edebilir.
		
		//ICustomerDal customerDal = new MySqlCustomerDal();
		
		CustomerManager customerManager = new CustomerManager(new OracleCustomerDal());
		//customerManager.customerDal = new MySqlCustomerDal();
		customerManager.add();
		
	}

}
