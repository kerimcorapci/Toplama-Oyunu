import java.util.Scanner;

public class Starter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String kullaniciAdi = "kerimcorapci";
		String sifre = "123456";
		Scanner tarayici = new Scanner(System.in);
		System.out.println("Kullanıcı adinizi girin");
		String girilenAd = tarayici.nextLine();
		System.out.println("Sifrenizi girin");
		String girilenSifre = tarayici.nextLine();
		if (kullaniciAdi.equals(girilenAd) && sifre.equals(girilenSifre)) {
			System.out.println("Sifrenizi dogru");
		}
		
		else if (!kullaniciAdi.equals(girilenAd)) {
			System.out.println("kullanıcı adınız hatali");
			
		}
		else if (!girilenSifre.equals(sifre)) {
			System.out.println("Sifre hatali");
		}
		//basina ! koyunca not oluyor
		
	}

}
