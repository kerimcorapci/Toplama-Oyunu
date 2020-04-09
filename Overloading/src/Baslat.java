
public class Baslat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//gereken durumlar için overload ediyoruz
		
		double kareAlanı = alanHesapla(5, "Kare");
		double daireAlanı = alanHesapla(3.5, "Daire");
		double ucgenAlani = alanHesapla(5, 4, "Üçgen");
		double dikdörtgenAlani = alanHesapla(5, 4, "Dikdörtgen");
		
	}

	/*
	 * Kare, Dikdörtgen, Üçgen, Daire
	 * */
	
	static double alanHesapla(double a, double b, String sekil) {
		double sonuc = 0;
		switch (sekil.toLowerCase()) {
		case "üçgen":
			sonuc = (a*b)/2;
			break;
		case "dikdörtgen":
			sonuc = a*b;
			break;
		}
		return sonuc;
	}
	
	static double alanHesapla(double a,String sekil) {
		double sonuc = 0;
		switch (sekil) {
		case "kare":
			sonuc = (a*a);
			break;
		case "daire":
			sonuc = (a*a)*3.14;
			break;
		}
		return sonuc;
	}
	
}
