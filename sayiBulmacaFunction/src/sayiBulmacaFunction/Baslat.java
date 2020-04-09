package sayiBulmacaFunction;

import java.util.Random;
import java.util.Scanner;

public class Baslat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*/
		 * 1. Uygulama, 1 ile 100 arasında bir sayı seçer
		 * 2. Kullanıcı tahmin eder. (x)
		 * 3. Değer karşılaştırılır
		 * 4. Eğer bilirse level atlar.
		 * 5. Yeni sayı 1 ile 200 aasındadır.
		 * 6. 500' de biter
		 */
		Scanner okur = new Scanner(System.in);
		int level =1;
		
		boolean bildiMi = false;
		boolean oyunBittiMi = false;
		
		while (!oyunBittiMi) {
			System.out.println(level);
			bildiMi = false;
			int sayi = rastgeleSayiSec(1, level*100);
			while (!bildiMi) {
				String yon = test(okur, sayi);
				System.out.println(yon);				
				if (yon.equals("Bildiniz")) {
					bildiMi = true;
					if (level<5) {
						level++;
					}
					else {
						oyunBittiMi = true;
					}
				}
			}
		}
	}

	private static String test(Scanner okur, int sayi) {
		System.out.println("Tahmin edin:");
		int tahmin = okur.nextInt();
		String yon = karsilastir(sayi, tahmin);
		return yon;
	}
	
	/** Bu function iki sayıyı karşılaştırır. */
	private static String karsilastir(int sayi, int tahmin) {
		// TODO Auto-generated method stub
		String donecekDeger ="";
		if (sayi>tahmin) {
			donecekDeger = "Yukari!";
		}
		else if (sayi<tahmin) {
			donecekDeger = "Aşagi!";
		}
		else {
			donecekDeger = "Bildiniz";
		}
		return donecekDeger;
	}

	static int rastgeleSayiSec(int min, int maks) {
		Random uretici = new Random();
		int sayi =uretici.nextInt(maks-min)+min;
		return sayi;
	}
	
}
