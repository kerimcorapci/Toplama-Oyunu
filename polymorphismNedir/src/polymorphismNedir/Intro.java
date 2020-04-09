package polymorphismNedir;

public class Intro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Kare k = new Kare();
		k.birimUzunluk =10;
		k.alanHesapla();
		int kAlan = k.alanHesapla();
		System.out.println(kAlan);
		
		Dikdörtgen d = new Dikdörtgen();
		d.setBirimUzunluk(5);
		d.setBirimUzunluk2(4);
		int dAlan = d.alanHesapla();
		System.out.println(dAlan);
		
	}

}
