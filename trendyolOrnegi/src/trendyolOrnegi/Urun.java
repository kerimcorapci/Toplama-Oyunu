package trendyolOrnegi;

public class Urun {
	
	public Urun () {
		//varsayılan şeyleri atamak için
		
	}
	
	public Urun (String ad, double fiyat, String aciklama) {
		this.urumAdi = ad;
		this.fiyat = fiyat;
		this.aciklama = aciklama;
		
	}
	
	
	private String resimAdresi;
	private String urumAdi;
	private String aciklama;
	private float puan;
	private double fiyat;
	private double indirimOrani;
	
	public String getResimAdresi() {
		return resimAdresi;
	}
	public void setResimAdresi(String resimAdresi) {
		this.resimAdresi = resimAdresi;
	}
	public String getUrumAdi() {
		return urumAdi;
	}
	public void setUrumAdi(String urumAdi) {
		this.urumAdi = urumAdi;
	}
	public String getAciklama() {
		return aciklama;
	}
	public void setAciklama(String aciklama) {
		this.aciklama = aciklama;
	}
	public float getPuan() {
		return puan;
	}
	public void setPuan(float puan) {
		this.puan = puan;
	}
	public double getFiyat() {
		return fiyat;
	}
	public void setFiyat(double fiyat) {
		this.fiyat = fiyat;
	}
	public double getIndirimOrani() {
		return indirimOrani;
	}
	public void setIndirimOrani(double indirimOrani) {
		this.indirimOrani = indirimOrani;
	}
	
}
