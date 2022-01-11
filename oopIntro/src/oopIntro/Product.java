package oopIntro;

public class Product {

	//-------------------------2--constructor blogu (olmas�n� gereken istedigin bir kod varsa)-----
	public Product() {
		System.out.println("Ben �al��t�m.");
	}
	//-----------Ayn� constructor dan bir daha olu�turuyor. ilk product buradan gidecek-------
	//-----------�ablon olu�turduk.------------
	public Product(int id, String name, double unitPrice, String detail) {
		
		this(); //bu classtaki parametresizi �al��t�r.
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