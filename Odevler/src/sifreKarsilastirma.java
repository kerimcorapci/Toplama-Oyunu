import java.util.Scanner;

public class sifreKarsilastirma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tarayici = new Scanner(System.in);
		System.out.println("Bir sifre girin");
		String sifre = tarayici.nextLine();
		
		boolean sayiMi = false;
		boolean harfMi = false;
		boolean alfanumerikDegilMi = false;
		
		//girilen sifreyi char char ayırıp array yapıyor
		char[] sifreninKarakterleri = sifre.toCharArray();
		for (char karakter : sifreninKarakterleri) {
			if (Character.isLetter(karakter)) {
				harfMi = true;
			}
			else if (Character.isDigit(karakter)) {
				sayiMi = true;
			}
			
			else {
				alfanumerikDegilMi = true;
			}	
			
		}
			if (sifreninKarakterleri.length>10) {
				System.out.println("Sifreniz karakter sayisi acisindan guclu seviyede");
			}
			else if (sifreninKarakterleri.length>7) {
				System.out.println("Sifreniz karakter sayisi acisindan orta seviyede");
			}
			else if (sifreninKarakterleri.length>=5) {
				System.out.println("Sifreniz karakter sayisi bakimindan gucsuz seviyede");
			}
			else {
				System.out.println("Sifrenizin karakter sayisi yetersiz");
			}
			
		
		
		System.out.println("Siferniz " + sifreninKarakterleri.length + " karakterden olusuyor.");
		
		if (alfanumerikDegilMi && harfMi && sayiMi) {
			System.out.println("Sifreniz karakter tipi bakımından güçlü seviyede.");
		}
		else if (sayiMi && harfMi&& !alfanumerikDegilMi) {
			System.out.println("Sifreniz karakter tipi bakımından orta seviyede.");
		}
		
		else {
			System.out.println("Sifreniz karakter tipi bakımından zayıf seviyede.");
		}
		
		
	}

}
