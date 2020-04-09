package taksitliSatis;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Scanner;

public class Taksit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 
		 * Ürün fiyatını girsin
		 * Taksit sayısını girsin
		 * Biz de ne zamana ne kadar ödeyeceğini gösterelim
		 * */
		Scanner okur = new Scanner(System.in);
		System.out.println("Lütfen ürünün fiyatini giriniz:");
		double fiyat = okur.nextDouble();
		System.out.println("Lütfen istediğiniz taksit sayıısnı giriniz:");
		int taksit = okur.nextInt();
		
		double tutar = fiyat / taksit;
		Calendar takvim = Calendar.getInstance();
		LocalDate tarih = LocalDate.now();
		DateTimeFormatter bicim = DateTimeFormatter.ofPattern("dd MMMM yyyy");
		 for (int i = 1; i <= taksit; i++) {
			 //takvim.add(Calendar.MONTH, i);
			 LocalDate yeniTarih = tarih.plusMonths(i);
			System.out.println(bicim.format(yeniTarih)+ " Taksit tutarı: " + tutar + " TL");
			//Yeni tarihi bu bicimde formatla demiş olduk
		}
		
		
	}

}
