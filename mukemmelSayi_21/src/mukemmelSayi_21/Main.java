package mukemmelSayi_21;

public class Main {

	public static void main(String[] args) {
		int number = 28;
		int toplam = 0;
		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				toplam = toplam + i;
			}

		}
		if (toplam == number) {
			System.out.println("Mukemmel Sayi");
		}
	}

}
