package loopDemo_11;

public class Main {

	public static void main(String[] args) {
		
		
		for(int i=1;i<10;i+=2) {
			System.out.println(i);
		}
		System.out.println("For Döngüsü bitti.");
		
		
		//While Döngüsü		
		
		int i=2;
		while(i<10) {
			System.out.println(i);
			i+=2;
		}
		
		System.out.println("While Döngüsü bitti.");
		
		//Do-While Döngüsü (While ile farký döngü bir kere çalýþýr. 
		//Örn: döngünün çalýþtýðýna dair log atmak.)
		
		int j=1;
		do {
			System.out.println("Loglandý.");
			System.out.println(j);
			j+=2;
		}while(j<10);
			
		System.out.println("Do-While Döngüsü bitti.");

	}

}
