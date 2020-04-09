package introJava;

import java.time.Year;
import java.util.Scanner;
import java.time.YearMonth;

public class Odev1farkli {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Lütfen dogum yilinizi girin:");
		
		Scanner tarayici = new Scanner (System.in);
		int DogumYili = tarayici.nextInt();
		
		//int year = Year.now();
		//int year = Calendar.getInstance().get(Calendar.YEAR);
		
		
		int year = Year.now().getValue();
		int yasiniz = year - DogumYili;
		System.out.println("Yasiniz");
		System.out.println(yasiniz);
			
	}

}
