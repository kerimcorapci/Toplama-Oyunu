package zarOyunu;

public class Oyuncu {

	private Zar oyuncununZari;
	private String oyuncuAdi;
	private int oyuncununAttigiZarDegeri;
	private double bahis = 0;
	private double bakiye = 100;
	
	
	public void setBakiye(double bakiye) {
		this.bakiye = bakiye;
	}



	public double getBakiye() {
		return bakiye;
	}



	public double getBahis() {
		return bahis;
	}



	public void setBahis(double bahis) {
		this.bahis = bahis;
	}



	public void ZarAt() {
		oyuncununAttigiZarDegeri = oyuncununZari.getZarDegeri();
	}
	
	
	
	public int getOyuncununAttigiZarDegeri() {
		return oyuncununAttigiZarDegeri;
	}



	public Zar getOyuncununZari() {
		return oyuncununZari;
	}
	public void setOyuncununZari(Zar oyuncununZari) {
		this.oyuncununZari = oyuncununZari;
	}
	public String getOyuncuAdi() {
		return oyuncuAdi;
	}
	public void setOyuncuAdi(String oyuncuAdi) {
		this.oyuncuAdi = oyuncuAdi;
	}
	
}
