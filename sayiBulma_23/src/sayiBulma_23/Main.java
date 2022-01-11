package sayiBulma_23;

public class Main {

	public static void main(String[] args) {

		int[] sayilar = new int[] { 1, 2, 5, 7, 9, 0 };
		int aranacak = 10;

		for (int i : sayilar) {
			if (i == aranacak) {
				System.out.println("var");
			}
		}
	}

}
