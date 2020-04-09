
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Lütfen bir sayi girin:");
		Scanner tarayici = new Scanner(System.in);
		int sayi = tarayici.nextInt();
		
		boolean asalMi = true;
		for (int i = 2; i < sayi; i++) {
			if (sayi % i == 0) {
				asalMi = false;
				break;
				//break in nedeni işlem fazlalığı olmaması için
			}
			
		}
		if (asalMi) {
			System.out.println("Sayı asaldır");
		}
		else {
			System.out.println("Sayı asal değildir");
		}
		
		//continue demo:
		int [] sicakliklar = {30,10,-3,15};
		for (int i = 0; i < sicakliklar.length; i++) {
			if (sicakliklar[i]<0) {
				continue;
			}
			System.out.println(sicakliklar[i]);
		
		}
		
		/* çarpım tablosu iç içe for döngüsü
		 * 2 * 1
		 * 2 * 2
		 * 
		 * 
		 * 9 * 9
		 */
		
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				int carpim = i * j;
				System.out.println(i + "x" + j + "=" + carpim);
			}
		}

	}
}