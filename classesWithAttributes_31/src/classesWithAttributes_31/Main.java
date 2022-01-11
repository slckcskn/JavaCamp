package classesWithAttributes_31;

public class Main {

	public static void main(String[] args) {
		
		Product product = new Product(2,"TV","Samsung TV",3000,3,"Siyah");
		
		Product product1 = new Product();
		product1.set_name("Laptop");
		product1.setId(1);
		product1.set_description("Asus Laptop");
		product1.set_price(5000);
		product1.set_stockAmount(3);
		
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		
		System.out.println(product.get_kod());
		
		productManager.Add2(1,"","",100,200);
		// System.out.println(product.name);

	}

}
