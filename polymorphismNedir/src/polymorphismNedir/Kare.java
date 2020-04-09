package polymorphismNedir;

public class Kare {
	int birimUzunluk =1;
	public int getBirimUzunluk() {
		return birimUzunluk;
	}
	public void setBirimUzunluk(int birimUzunluk) {
		this.birimUzunluk = birimUzunluk;
	}
	int alanHesapla() {
		return birimUzunluk * birimUzunluk;
	}
	int cevreHesapla() {
		return 4 * birimUzunluk;
	}
}
