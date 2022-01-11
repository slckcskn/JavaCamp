package miniProjeAsalSayi_19;

public class Main {

	public static void main(String[] args) {

		int number = 1;
		boolean isPrime = true;

		if (number == 1) {
			System.out.println("Sayý asal deðildir.");
			return;
		}

		if (number < 1) {
			System.out.println("Geçersiz sayý.");
		}

		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				isPrime = false;
			}

		}

		if (isPrime == true) {
			System.out.println("Sayý asaldýr.");
		} else {
			System.out.println("Sayý asal deðildir.");
		}
	}

}
