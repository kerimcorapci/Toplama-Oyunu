package bitmeyen;

import java.util.Scanner;

public class Baslat {
//BİTMEYEN DÖNGÜ 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean bitsinMi = false;
		Scanner tarayici = new Scanner(System.in);
		while (!bitsinMi) {
			System.out.println("Sifreyi girin (çıkmak için 0 girin)");
			String cevap = tarayici.next();
			if (cevap.equals("0")) {
				bitsinMi = true;
			}
		}
	}

}
