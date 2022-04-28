package staticDemo_45;

public class ProductManager {
	public void add(Product product) {
		
		
		//Ýlk kullaným
		//ProductValidator validator = new ProductValidator();
		
		//if(validator.isValid(product)) {
			
		if(ProductValidator.isValid(product)) {
			System.out.println("Eklendi.");
		}else {
			System.out.println("Ürün bilgileri eklenemedi.");
		}
		
		//Yapýcý bloklar new leyince çalýþýyor.
		ProductValidator productValidator = new ProductValidator();
		productValidator.bisey();
		
	}
	
	


}
