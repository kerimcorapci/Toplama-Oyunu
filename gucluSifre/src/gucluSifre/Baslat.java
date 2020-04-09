package gucluSifre;

import java.util.Scanner;

public class Baslat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//sadece sayı ya da harf ZAYIF
		//Hem sayı hem de harf ise orta 
		//Hem sayı hem harf hem de alfanumerik olmayan GÜÇLÜ
		Scanner tarayici = new Scanner(System.in);
		System.out.println("Bir sifre girin");
		String sifre = tarayici.nextLine();
		
		boolean sayiMi = false;
		boolean harfMi = false;
		boolean alfanumerikDegilMi = false;
		
		//girilen sifreyi char char ayırıp array yapıyor
		char[] sifreninKarakterleri = sifre.toCharArray();
		for (char karakter : sifreninKarakterleri) {
			if (Character.isLetter(karakter)) {
				harfMi = true;
			}
			else if (Character.isDigit(karakter)) {
				sayiMi = true;
			}
			
			else {
				alfanumerikDegilMi = true;
			}		
		}
		System.out.println("Siferniz " + sifreninKarakterleri.length + " karakterden olusuyor.");
		
		if (alfanumerikDegilMi && harfMi && sayiMi) {
			System.out.println("Güçlü");
		}
		else if (sayiMi && harfMi&& !alfanumerikDegilMi) {
			System.out.println("Orta");
		}
		
		else {
			System.out.println("Zayıf");
		}
		
		
	}

}
