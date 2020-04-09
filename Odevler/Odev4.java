package introJava;

import java.util.Scanner;

public class Odev4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ana para, faize yatırılan süre, faiz oranı
		
		System.out.println("Lütfen Bankaya yatirdiginiz parayi giriniz:");
		Scanner tarayici = new Scanner (System.in);
		int anaPara = tarayici.nextInt();
		
		System.out.println("Lütffen paranizi bankada tutacaginiz ay sayisini giriniz:");
		Scanner tarayici1 = new Scanner (System.in);
		int aySayisi = tarayici1.nextInt();
		
		System.out.println("Lütfen faiz oranini ondalık sayı olarak giriniz(eger %9 ise 1.09)");
		Scanner tarayici2 = new Scanner (System.in);
		double faizOranı = tarayici2.nextDouble();
		
		System.out.println("Faiz islenmis para miktariniz:");
		
		double faizliPara = anaPara* (aySayisi/12) * faizOranı;
		
		System.out.println(faizliPara);
									
	}

}
