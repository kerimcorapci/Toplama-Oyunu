package introJava;

import java.util.Scanner;

public class Odev3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Herhangi bir dörtgenin alan hesabı
		
		System.out.println("Dörtgenin eninin uzunlugunu girin:");
		Scanner tarayici = new Scanner (System.in);
		int enUzunlugu = tarayici.nextInt();
		
		
		System.out.println("Dörtgenin boyunun uzunlugunu girin:");
		Scanner tarayici1 = new Scanner (System.in);
		int boyUzunlugu = tarayici1.nextInt();
		
		System.out.println("Dörtgenin alanı:");
		int alan = boyUzunlugu * enUzunlugu;
		System.out.println(alan);
		
}
}