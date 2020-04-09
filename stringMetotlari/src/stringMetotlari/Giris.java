package stringMetotlari;

import java.util.Random;

public class Giris {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String kelime = "bilgisayar";
		String donusDegeri = kelime.substring(2);
		System.out.println(donusDegeri);
		
		String [] hocalar = {"türkay ürkmez", "kerim corapci", "hans neichmann"};
		
		//Soyadının ilk 3 harfi... ilk harfi büyük
		//İlk harfi büyük olacak şekilde adın ilk iki harfi
		for (String hoca : hocalar) {
			String ilkHarf = hoca.substring(0, 1).toUpperCase();
			//0 dan 1 e kadar (1 dahil değil demek)
			String digerİki = hoca.substring(1, 2);
			String ad = ilkHarf + digerİki;
			//System.out.println(ad);
			
			String[] arr = hoca.split(" ");
			String soyad = arr[arr.length-1];
			String soyadİlh = soyad.substring(0, 1).toUpperCase();
			String soyadinDigerHarfleri = soyad.substring(1, 3);
			String soyadYeni = soyadİlh + soyadinDigerHarfleri;
			System.out.println(soyadYeni+ad);
			
			//String soyadınİlkHarfi2 = hoca.split(" ")[hoca.split(" ").length-1].toUpperCase();
			//int sayi = new Random().nextInt(100);
			
		}
		
		//ayna
		//0123
		//
		
		String kelime2 = "ayna";
		int sonuc1 =kelime2.indexOf("a",0);
		System.out.println(sonuc1);
		int sonuc2 =kelime2.indexOf("a",1);
		System.out.println(sonuc2);
		sonuc1 =kelime2.indexOf("a",4);
		System.out.println(sonuc1);
		
		//
		
		int baslangicIndexi = 0;
		String harfinYerleri = "";
		while (kelime2.indexOf("a",baslangicIndexi)!= -1) {
			
			int harfinIndexi = kelime2.indexOf("a",baslangicIndexi);
			harfinYerleri += harfinIndexi +", ";
			baslangicIndexi = harfinIndexi +1;
			
		}
		System.out.println("Ayna kelimesinde a harfinin yerleri: " + harfinYerleri);
		
		
		
		
		
		
	}
}
