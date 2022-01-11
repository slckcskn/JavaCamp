package oopIntro;

public class Product {

	//-------------------------2--constructor blogu (olmasýný gereken istedigin bir kod varsa)-----
	public Product() {
		System.out.println("Ben Çalýþtým.");
	}
	//-----------Ayný constructor dan bir daha oluþturuyor. ilk product buradan gidecek-------
	//-----------Þablon oluþturduk.------------
	public Product(int id, String name, double unitPrice, String detail) {
		
		this(); //bu classtaki parametresizi çalýþtýr.
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.detail = detail;

	}

	//---------------------1----------------------
	int id;
	String name;
	double unitPrice;
	String detail;

}