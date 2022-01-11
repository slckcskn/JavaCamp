package methods2_25;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Bug�n hava �ok g�zel.";
		String yeniMesaj = mesaj.substring(0, 2);
		System.out.println(yeniMesaj);
		int sayi = topla(5,7);
		System.out.println(sayi);
		int toplam = topla2(2,3,4,5,6);
		System.out.println(toplam);
	}

	public static void ekle() {
		System.out.println("Eklendi");
	}

	public static void sil() {
		System.out.println("Silindi");
	}

	public static void guncelle() {
		System.out.println("G�ncellendi");
	}
	
	public static int topla(int sayi1,int sayi2) {
		return sayi1+sayi2;
	}
	
	//------------------------------------26.Ders--------------------------------------------------
	public static int topla2 (int... sayilar) {
		int toplam = 0;
		for(int sayi:sayilar) {
			toplam=toplam+sayi;
		}
		return toplam;
	}
	
	public static String sehirVer() {
		return "Ankara";
	}
}
