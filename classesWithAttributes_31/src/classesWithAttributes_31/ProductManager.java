package classesWithAttributes_31;

public class ProductManager {

	public void Add(Product product) {
		System.out.println("Ürün eklendi. "+product.get_name());
	}
	
	
	//Kötü bir yazým örneði:
	public void Add2(int id, String name, String description, double price, int stockAmount) {
		
	}
}
