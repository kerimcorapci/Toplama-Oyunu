package oopTemelleri;

public class Personel {
	//Her personelin ............... vardır
	private String ad;
	private String soyad;
	private String ozgecmis;
	private String telefon;
	private String adres;
	private double minimumMaas;
	
	//Her personel xxxxxxxxxxxxxxxx yapar.
	
	public void setMinimumMaas(double deger) throws Exception {
		if (deger>0) {
			this.minimumMaas = deger;
		}else {
			throw new Exception("maaş 0' dan büyük olmalı");
		}
	}
	
	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getSoyad() {
		return soyad;
	}

	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}

	public String getOzgecmis() {
		return ozgecmis;
	}

	public void setOzgecmis(String ozgecmis) {
		this.ozgecmis = ozgecmis;
	}

	public String getTelefon() {
		return telefon;
	}

	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}

	public String getAdres() {
		return adres;
	}

	public void setAdres(String adres) {
		this.adres = adres;
	}

	public double getMinimumMaas() {
		return this.minimumMaas;
		
	}
}
