package loopDemo_11;

public class Main {

	public static void main(String[] args) {
		
		
		for(int i=1;i<10;i+=2) {
			System.out.println(i);
		}
		System.out.println("For D�ng�s� bitti.");
		
		
		//While D�ng�s�		
		
		int i=2;
		while(i<10) {
			System.out.println(i);
			i+=2;
		}
		
		System.out.println("While D�ng�s� bitti.");
		
		//Do-While D�ng�s� (While ile fark� d�ng� bir kere �al���r. 
		//�rn: d�ng�n�n �al��t���na dair log atmak.)
		
		int j=1;
		do {
			System.out.println("Logland�.");
			System.out.println(j);
			j+=2;
		}while(j<10);
			
		System.out.println("Do-While D�ng�s� bitti.");

	}

}
