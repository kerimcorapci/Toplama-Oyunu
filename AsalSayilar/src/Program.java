package asalSayilar;
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
			}
			
		}
		if (asalMi) {
			System.out.println("Sayı asaldır");
		}
		else {
			System.out.println("Sayı asal değildir");
		}
	}

}
