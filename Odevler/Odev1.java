package introJava;

import java.util.Scanner;

public class Odev1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Lütfen dogum yilinizi girin:");
		
		//Girilen değeri okuması icin Scanneri kullanıyorum:
		Scanner tarayici = new Scanner (System.in);
		int DogumYili = tarayici.nextShort();
		
		
		//Yasini hesaplama
		// 2020- DogumYili
		
		int buYil = 2020;
		int yasiniz = buYil-DogumYili;
		System.out.println("Yasiniz");
		System.out.println(yasiniz);
		
	}

}
