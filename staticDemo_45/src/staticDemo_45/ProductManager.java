package staticDemo_45;

public class ProductManager {
	public void add(Product product) {
		
		
		//�lk kullan�m
		//ProductValidator validator = new ProductValidator();
		
		//if(validator.isValid(product)) {
			
		if(ProductValidator.isValid(product)) {
			System.out.println("Eklendi.");
		}else {
			System.out.println("�r�n bilgileri eklenemedi.");
		}
		
		//Yap�c� bloklar new leyince �al���yor.
		ProductValidator productValidator = new ProductValidator();
		productValidator.bisey();
		
	}
	
	


}
