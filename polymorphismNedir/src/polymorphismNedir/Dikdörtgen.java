package polymorphismNedir;

public class Dikdörtgen extends Kare {

	private int birimUzunluk2 =1;
	
	public int getBirimUzunluk2() {
		return birimUzunluk2;
	}

	public void setBirimUzunluk2(int birimUzunluk2) {
		this.birimUzunluk2 = birimUzunluk2;
	}

	@Override
	int alanHesapla() {
		// TODO Auto-generated method stub
		return birimUzunluk * birimUzunluk2;
	}
	
}
