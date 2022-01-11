package methods_24;

public class Main {

	public static void main(String[] args) {
		
		sayiBulmaca();

	}
	
	public static void sayiBulmaca() {
		
		int[] sayilar = new int[] { 1, 2, 5, 7, 9, 0 };
		int aranacak = 9;
		boolean varMi = false;

		for (int i : sayilar) {
			if (i == aranacak) {
				varMi=true;
				
			}
		}
		
		//Açýklamasý:
		//String mesaj=" ";
		if(varMi) {
			//mesaj="Sayi mevcuttur: "+aranacak;
			//mesajVer(mesaj);
			
			mesajVer("Sayi mevcuttur: "+aranacak);
		}else {
			mesajVer("Sayi mevcut deðildir: "+aranacak);
		}
	}
	
	public static void mesajVer(String mesaj) {
		
		
		System.out.println(mesaj);
		
		
		
		
		
		
		
	}
}
