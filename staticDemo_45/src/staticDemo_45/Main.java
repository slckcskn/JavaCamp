package staticDemo_45;

public class Main {

	public static void main(String[] args) {
		ProductManager manager = new ProductManager();
		Product product = new Product();
		product.id = 1;
		product.name = "Mouse";
		product.price = 10;
		
		
		manager.add(product);
		
		DatabaseHelper.Crud.update();

	}

}
