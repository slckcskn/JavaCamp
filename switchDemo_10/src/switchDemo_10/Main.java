package switchDemo_10;

public class Main {

	public static void main(String[] args) {

		char grade = 'B';

		switch (grade) {
		case 'A':
			System.out.println("M�kemmel ge�tiniz");
			break;
		case 'B':
			
		case 'C':
			System.out.println("�yi ge�tiniz");
			break;
		case 'D':
			System.out.println("Fena de�il ge�tiniz");
			break;
		case 'E':
			System.out.println("Maalesef kald�n�z");
			break;
		default:
			System.out.println("Ge�ersiz not girdiniz");

		}

	}

}
