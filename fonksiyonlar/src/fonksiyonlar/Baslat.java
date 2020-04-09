package fonksiyonlar;

public class Baslat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Bir problemi küçük parçalarına bölmek için metod yazılır
		//her zaman verilen iki sayıyı toplamak istiyorum
		//bir de ekranda sürekli mesaj yazmam gerekiyor.
		int sonuc = topla(3, 5);
		System.out.println(sonuc);
		ekrandaGoster("Mesaj...");
		ekrandaGoster(String.valueOf(sonuc));
		
		int sonuc1 =cikar(3, 5);
		System.out.println(sonuc1);
		
		int sonuc2 = bol(10, 2);
		System.out.println(sonuc2);
		
		int sonuc3 = carp(3, 2);
		System.out.println(sonuc3);
		
		double sonuc4 =ussunuAl(3, 2);
		System.out.println(sonuc4);
	}
	/**Bu fonksiyon iki sayıyı toplar */
	static int topla(int x, int y) {
		int toplam = x+y;
		return toplam;
	}
	/**Bu fonksiyon iki sayıyı x-y şeklinde birbirinden çıkarır */
	static int cikar(int x, int y) {
		
		int fark = x-y;
		return fark;	
	}
	/**Bu fonksiyon iki sayıyı çarpar */
	static int carp (int x, int y) {
		
		int carpim = x*y;
		return carpim;
	}
	/**Bu fonksiyon iki sayıyı x/y şeklinde birbirine böler */
	static int bol (int x, int y) {
		
		int bolum = x/y;
		return bolum;		
	}
		
	// void geriye bir değer döndürmüyorsa da bir işlem yapıyorsa
	static void ekrandaGoster(String gosterilecekMesaj) {
		System.out.println(gosterilecekMesaj);
	}
	static	double ussunuAl(double x, double y) {
		/*
		 * 2 üssü 3 = 2*2*2
		 * */
			double sonuc = 1;
			for (int i = 1; i <= y; i++) {
				sonuc *=x;
			}
			return sonuc;
	}
}
