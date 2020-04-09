import java.util.Random;
import java.util.Scanner;

public class Baslatici {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random rastgeleSayiUretici = new Random();
		int uretilenSayi = rastgeleSayiUretici.nextInt(99)+1;		
		Scanner okuyucu = new Scanner(System.in);
		
		boolean bildiMi = false;
		while(bildiMi == false)
		{
		
			System.out.println("Lütfen tahmini yapın:");		
			int tahmin = okuyucu.nextInt();
		
			if (tahmin < uretilenSayi) {
			System.out.println("Daha yukari!");
				
			}
		
		
			else if (tahmin > uretilenSayi) {
			System.out.println("Asagi!");
			
			}
			
		
			else {
			System.out.println("Tebrikler bildiniz!");
			 bildiMi = true;
				}
		
		}
			
		
	  }
		
	}


