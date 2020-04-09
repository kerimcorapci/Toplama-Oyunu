package zarOyunu;

public class Oyun {

	private Oyuncu oyuncu1;
	private Oyuncu oyuncu2;
	
	
	public void IlkOyuncuOynat() {
		oyuncu1.ZarAt();
		//System.out.println("İlk Oyuncu !");
		
	}
	public void IkinciOyuncuOynat() {
		oyuncu2.ZarAt();
		//System.out.println(oyuncu2.getOyuncununAttigiZarDegeri());
	}
	
	public Oyuncu getOyuncu1() {
		return oyuncu1;
	}
	public void setOyuncu1(Oyuncu oyuncu1) {
		this.oyuncu1 = oyuncu1;
	}
	public Oyuncu getOyuncu2() {
		return oyuncu2;
	}
	public void setOyuncu2(Oyuncu oyuncu2) {
		this.oyuncu2 = oyuncu2;
	}
	
	
	
	
	public Oyuncu Karsilastir() {
		if (oyuncu1.getOyuncununAttigiZarDegeri()>oyuncu2.getOyuncununAttigiZarDegeri()) {
			
			oyuncu1.setBakiye(oyuncu1.getBakiye()+oyuncu2.getBahis());
			oyuncu2.setBakiye(oyuncu2.getBakiye()-oyuncu2.getBahis());
			
			return oyuncu1;
			
		}
		else if (oyuncu1.getOyuncununAttigiZarDegeri()<oyuncu2.getOyuncununAttigiZarDegeri()) {
			
			oyuncu2.setBakiye(oyuncu2.getBakiye()+oyuncu1.getBahis());
			oyuncu1.setBakiye(oyuncu1.getBakiye()-oyuncu1.getBahis());
			
			return oyuncu2;
		}
		else {

			return null;
		}
	}
}
