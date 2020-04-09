import java.util.Scanner;

public class SezarSifreCozucu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tarayici = new Scanner(System.in);
		System.out.println("Sifrelenmesini istediginiz kelimeyi girin:");
		String isim = tarayici.nextLine();
		//String isim = "kerim";
		String yeniIsim = "";
		for (int i = 0; i < isim.length(); i++) {
			//1. kelimenin i. pozisyonundaki harfi al:
			char kar = isim.charAt(i);
			//2. O harfi sayıya çevir
			int ascii = (int)kar;
			//3. Sayıyı bir arttır
			int yeniHarfAscii = ascii + 1;
			//4.Yeni sayıyı harfe çevir
			char yeniHarf = (char)yeniHarfAscii;
			//5.yeni harfi kelime ile birleştir
			yeniIsim += yeniHarf;
		}
		System.out.println( isim + " Kelimesinin sifrelenmis hali = "  +  yeniIsim);
		
		//Girilen şifreli halini çözme
		
		String arananKelime="";
		
		System.out.println("Lütfen sifresi çözülecek kelimeyi giriniz:");
		String girilen = tarayici.nextLine();
		
		for (int i = 0; i < girilen.length(); i++) {
			char karakter = girilen.charAt(i);
			int ascii1 = (int)karakter;
			int yeniHarfAscii1 = ascii1 - 1;
			char yeniHarf1 = (char)yeniHarfAscii1;
			arananKelime += yeniHarf1;
		}
		System.out.println(arananKelime);
		
		// 2n-1 forumnda şifreliyor
		System.out.println("Sifrelenmesini istediginiz kelimeyi girin:");
		String kelime1 = tarayici.nextLine();
		String yeniKelime1 = "";
		
		for (int i = 0; i < kelime1.length(); i++) {
			char kar1 = isim.charAt(i);
			int ascii = (int)kar1;
			int yeniHarfAscii2 = (2*(ascii)-1);
			char yeniHarf2 = (char)yeniHarfAscii2;
			yeniKelime1 += yeniHarf2;
		}
		System.out.println(yeniKelime1);	
		
		
		}
	}


