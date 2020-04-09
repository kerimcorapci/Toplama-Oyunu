package arabaSimulasiyonu;

public class Araba {

	public Araba(boolean otomatikMi) {
		this.otomatikMi = otomatikMi;
		
	}
	
	private boolean otomatikMi = false;
	private boolean CalisiyorMu = false;
	private int anlıkHız = 0;
	
	
	public int getAnlıkHız() {
		return anlıkHız;
	}
	public void Calistir() {
		CalisiyorMu= true;
	}
	public void GazaBas() {
		if (CalisiyorMu) {
			anlıkHız += 10;
		}
		else {
			System.out.println("Lütfen Arabayı çalıştırın!");
		}
	}
	public void FreneBas() {
		if (CalisiyorMu) {
			if (anlıkHız<=10) {
				anlıkHız=0;
			}
			else {
				anlıkHız -=10;
			}
		}
	}
	public void Dur(){
		if (CalisiyorMu) {
			anlıkHız=0;
			CalisiyorMu = false;
		}
		else {
			System.out.println("Lütfen Arabayı çalıştırın!");
		}
	}
	public void VitesDegistir() {
		if (otomatikMi) {
			System.out.println("Vites değiştirilemez - Otomatik!");
		}
		else {
			System.out.println("Vites değiştirildi");
			
		}
	}
}
