package abstractClasses_40;

public abstract class GameCalculator {
	public abstract void hesapla();
	
	//abstract sýnýflar new'lenemez! Zorunlu operasyon ekleniyor.
	
	public final void gameOver() {
		System.out.println("Oyun bitti.");
	}
}
