package trendyolOrnegi;

import java.util.ArrayList;
import java.util.Scanner;

public class Intro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Koleksiyon ve arrayler kardeş gibi evrilmiş hali
		ArrayList liste = new ArrayList();
		
		//Boxing:
		liste.add(3);
		Object obj1=3;
		liste.add("Kerim");
		Object obj2="Kerim";
		liste.add(false);
		
		//UnBoxing:
		//String isim = (String)liste.get(0);
		
		ArrayList<String> isimler = new ArrayList<String>();
		
		ArrayList<Urun> urunlerim = new ArrayList<Urun>();
		
		Urun tisort = new Urun();
		tisort.setUrumAdi("Aqua Di Polo");
		tisort.setAciklama("Kadın Güneş Gözlüğü PLD17B195801");
		tisort.setFiyat(70);
		
		Urun gozluk = new Urun();
		gozluk.setUrumAdi("Polo tişört");
		gozluk.setAciklama("Kırmızı Polo Yaka");
		gozluk.setFiyat(100);
		
		
		urunlerim.add(tisort);
		urunlerim.add(gozluk);
		
		//Constructor kullanarak ekledik:
		urunlerim.add(new Urun("Kot Pantolon", 150, "Slim Fit"));
		
		//Yine constructor ama bu kez önce nesne oluşturduk...
		Urun sort = new Urun("Bermuda", 15, "İğrenç bir şort");
		urunlerim.add(sort);
		
		
		for (Urun urun : urunlerim) {
			System.out.println("----------------------------------------");
			System.out.println("|  urun adı: " + urun.getUrumAdi() + " "+ urun.getFiyat() + "TL");
			System.out.println("-----------------------------------------");
		}
	
		
		
	}

}
