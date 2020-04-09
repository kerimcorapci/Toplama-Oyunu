package toplamaOyunu;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Intro {

	public static void main(String[] args) {
		
		 //Oyunu başlatmak için a dışında bir tuşa basın
		 //Eğer a ise uygulama durduruldu yaz
		 		
		Scanner scanner = new Scanner(System.in);
		// TODO Auto-generated method stub
		//Normal kod olarak
		//Random random = new Random();
		//int n1 = random.nextInt(10)+1;
		//int n2 = random.nextInt(10)+1;
				
		int level =1;
		
	
		boolean oyunaDevamEdilsinMi = true;
		try {
				do {
					ekranaYaz("Level "+ level);
					try {
						Thread.sleep(1000);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
															 }
					
					//int number1 = RandomNumberGenerator();
					//int number2 = RandomNumberGenerator();
					int number1 = rastgeleSayiSec(1, level*10);
					int number2 = rastgeleSayiSec(1, 10*level);
					int total = number1 + number2;
					ekranaYaz("Lütfen assagidaki islemin sonucunu yaziniz");
		
					ekranaYaz(number1+" + "+number2);
					int girilenSayi = scanner.nextInt();
		
						if (girilenSayi == (number1+number2)) {
							ekranaYaz("Tebrikler soruyu doğru bildiniz");
							if (level<10) {
								level++;
										}
							}
							else {
							ekranaYaz("Soruyu bilemediniz");
							ekranaYaz("Oyunun bitiği level = " + level);
							}
		
						boolean karakterDogruMu = false;
						while (!karakterDogruMu) {
						//Eğer başka karakter girdiyse tekrardan devam etmek istiyor musunuz diye sorsun						
							
					System.out.println("Oyuna devam etmek istiyor musunuz (E/H)?");
					String cevap = scanner.next();
							
							
						if (cevap.toUpperCase().equals("E")) {
							oyunaDevamEdilsinMi = true;
							karakterDogruMu = true;
							ekranaYaz("Oyuna devam ediliyor");
							try {
								Thread.sleep(1500);
									} catch (InterruptedException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
																	 }
							}
							else if (cevap.toUpperCase().equals("H")) {		
									oyunaDevamEdilsinMi = false;
									karakterDogruMu = true;
								ekranaYaz("Oyun durduruldu");						
							}
							else {
								ekranaYaz("Farklı bir karakter girdiniz, lütfen E veya H yazınız");
								karakterDogruMu = false;
								oyunaDevamEdilsinMi = false;
								}	
						
						} 
						
				} while(oyunaDevamEdilsinMi);			
		
		
			
	}
	catch (InputMismatchException hata1) {
			// TODO: handle exception
			ekranaYaz("Lütfen bir sayi giriniz");
		}
	}
	/**1 den 10 a kadar rastgele bir sayi üretir */
	public static int RandomNumberGenerator() {
	Random random = new Random();
	return random.nextInt(10)+1;
		}
	/**Ekrana yazılan mesaji yazar */
	static void ekranaYaz(String gosterilecekMesaj) {
	System.out.println(gosterilecekMesaj);
		}
	static int rastgeleSayiSec(int min, int maks) {
		Random random = new Random();
		int sayi =random.nextInt(maks-min)+min;
		return sayi;
}
}
