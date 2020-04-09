
public class Araba {
	private boolean calısıyorMu = false;
	
	public void Calistir() {
		calısıyorMu = true;
		
	}
	public void GazaBas() {
		if (calısıyorMu) {
			System.out.println("Bastim gaza!");
		}
		else {
			System.out.println("Kontakt çalışmıyor ki!");
		}
	}
	
}
