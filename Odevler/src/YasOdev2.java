import java.time.Year;
import java.util.Scanner;

public class YasOdev2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Lütfen dogum yilinizi girin:");
		
		Scanner tarayici = new Scanner (System.in);
		int DogumYili = tarayici.nextInt();
		
			
		int year = Year.now().getValue();
		int yasiniz = year - DogumYili;
		System.out.println("Yasiniz");
		System.out.println(yasiniz);
		
		if (DogumYili>year) {
			System.out.println("Gecerli olmayan bir dogum yili girdiniz!");
		}
		
		if (yasiniz<0) {
			System.out.println("Daha dogmadiniz");
		}
		
		else if (yasiniz<28) {
			System.out.println("Gencsiniz");
		}
		
		else if (yasiniz>70) {
			System.out.println("Yaslisiniz");			
		} 
		
		else {
			System.out.println("Ne genc ne yaslisiniz");
		}
		
		
	}

}
	//girilecek yıla min sınır koyma veya yas <0 ise ne yapılmalı? ya da ilk kontrol et yas negatif ise hata ver