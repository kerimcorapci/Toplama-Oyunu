package whileDongusu;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//for da daha çok sayılar ile döngüler yaptık
		//Bir koşul gerçekleşene kadar bir eylem yaptırmak
		int sayi=1;		
		while(sayi<10) {
			System.out.println(sayi++);		
		}

		//ASCII tablosu
		int deger = 65;
		
		
		for (int i = 65; i < 95; i++) {
			char karakter =(char)i;
			System.out.println(karakter);
		}
		String isim = "kerim";
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
		System.out.println(yeniIsim);
	
		
		
		
		
	}
	
}