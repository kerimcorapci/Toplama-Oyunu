package introJava;

import java.util.Scanner;

public class Odev2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//(a+b)^2 hesaplama
		System.out.println("Hesaplanmak istenen işlem = (a+b)^2");
		System.out.println("Lütfen degiskenleri girin");
		System.out.println("İlk degisken (a)'yi girin:");
		
		
		Scanner tarayici = new Scanner (System.in);
		int ilkDegisken = tarayici.nextInt();
		
		System.out.println("İkinci degisken (b)'yi girin:");
		
		Scanner tarayici1 = new Scanner (System.in);
		int ikinciDegisken = tarayici1.nextInt();
		
		System.out.println("İsleminizin sonucu:");
		int sonuc = ilkDegisken*ilkDegisken + 2*ilkDegisken*ikinciDegisken + ikinciDegisken*ikinciDegisken;
		System.out.println(sonuc);
		
		
		
		
		
		
	}

}
