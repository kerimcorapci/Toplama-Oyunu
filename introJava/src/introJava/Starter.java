package introJava;

import java.util.Scanner;

public class Starter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Lütfen isminizi giriniz");
		
		// girilen değeri oku:
		//Girilen değeri okumak için evimize bir scanner aleti aldık:
		Scanner tarayici = new Scanner(System.in);
		String girilenDeger = tarayici.nextLine();
		System.out.println(girilenDeger);
		
		
		//örnek: Boy kilo endeksini bulalım:
		//kilo / (boy * boy):
		System.out.println("Kilonuzu girin:");
		
		int kilo = tarayici.nextInt();
		System.out.println("Boyunuzu metre cinsinden girin:");
		double boy = tarayici.nextDouble();
		double bmi = kilo/ (boy * boy);
		System.out.println("Vücut kitle indeksiniz");
		System.out.println(bmi);
		
		/*
		 * Veri tipleri üç ana kategoriye ayrılır
		 * Sayısal
		 * //1. Tam sayılar
		 * //2. Ondalıklı sayılar
		 * 
		 * Sözel
		 * 
		 * Mantıksal
		 * */
		
		//1. Tam sayılar
		byte enKucuk = 127;
		short onaltiBit = 32767;
		int otuzikiBit = -2147483648; 
		long altmisDortBit = 4000000000;
		
		//2. Ondalıklı sayılar
		double pi = 3.14;
		float altinOran = 1.639f;
		
		//Sözel:
		char karakter = '!';
		String cumle ="Günaydın Kerim... Hos geldin...";
		
		//Mantıksal:
		boolean bugunSaliMi = true;
		
		
			
	}

}
