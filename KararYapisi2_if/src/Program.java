import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
				Scanner okuyucu = new Scanner(System.in);
				System.out.println("İlk sayiyi girin");
				int ilkSayi = okuyucu.nextInt();
				System.out.println("İkinci sayiyi girin");
				int ikinciSayi = okuyucu.nextInt();
				
				if (ilkSayi == ikinciSayi) {
					System.out.println("İki sayı da eşittir");
				
				}
				
				else if(ilkSayi > ikinciSayi) {
					System.out.println(ilkSayi + "büyüktür" + ikinciSayi);
				}
				
				
				else  {
					System.out.println(ilkSayi + "kücüktür" + ikinciSayi);
				}
				
				int ay = 10;
				int gun = 20;
				if (ay == 10 && gun ==20) {
					System.out.println( "Dogum günün kutlu olsun :)");
				
				}
				
				//Örnek bahar ayları: 
				if (ay == 3|| ay ==4 || ay==5) {
				System.out.println( "İlk bahar mevsimi....");
				
				}
				
				// bir = değer atama, == matematiksel olarak
				// & ve && ilki doğru değilse devamina bakmıyor
				// || veya, or 
				
				
	}

}
