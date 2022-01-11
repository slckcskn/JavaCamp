package switchDemo_10;

public class Main {

	public static void main(String[] args) {

		char grade = 'B';

		switch (grade) {
		case 'A':
			System.out.println("Mükemmel geçtiniz");
			break;
		case 'B':
			
		case 'C':
			System.out.println("Ýyi geçtiniz");
			break;
		case 'D':
			System.out.println("Fena deðil geçtiniz");
			break;
		case 'E':
			System.out.println("Maalesef kaldýnýz");
			break;
		default:
			System.out.println("Geçersiz not girdiniz");

		}

	}

}
