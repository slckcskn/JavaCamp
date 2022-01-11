package classes_27;

public class Main {

	public static void main(String[] args) {
		//---------------------------------------------28.Ders------------------------------------------------
		//Reference Type
		CustomerManager customerManager = new CustomerManager();
		CustomerManager customerManager2 = new CustomerManager();
		customerManager=customerManager2;
		customerManager.Add();
		customerManager.Delete();
		customerManager.Update();

	}
	
}
