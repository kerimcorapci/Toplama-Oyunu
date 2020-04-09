import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.*;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Amaç: İki tam sayıyı birbirlerine bölen uygulama 
		Scanner tarayici = new Scanner(System.in);
		
		try
		{
			
		
			System.out.println("Lütfen 1. sayıyı girin ");
			int sayi1 = tarayici.nextInt();
		
			System.out.println("Lütfen 2. sayıyı girin ");
			int sayi2 = tarayici.nextInt();
		
			int sonuc = sayi1/sayi2;
			System.out.println(sonuc);
			
		}
		
		catch(InputMismatchException hata1) {
			System.out.println("Sadece sayı giriniz");
			
		}
		
		catch(ArithmeticException e) {
			System.out.println("Tam sayılar 0'a bölünmez");
			
		}
		
		catch(Exception genel) {
			System.out.println("Bir hata olustu. Hata mesajı" + genel.getMessage() );
						
		}
		

		//istisnai (exception) hata 3 yerine üç yazıyorsun
		// run et ve çıkan hataya göre catchini yaz
		
	}

}
