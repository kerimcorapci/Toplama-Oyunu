import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.Yöntem elemanları biliyorum
		String[] gunler = {"Pazartesi", "Salı", "Çarşamba"};
		//2.Yöntem kaç eleman olacağını biliyorum
		int [] yaslar = new int [17];
		//boolean [] cevaplar = {true,true,false};
		
		//System.out.println(gunler[2]); //0 dan başlıyor
		//System.out.println(gunler.length); //kaç eleman var
		//System.out.println(gunler[gunler.length-1]);//Her zaman son elemanı vermesi için
		yaslar[0]=40; //ilk kişinin yaşı 40 demiş oldum
		
		/*/
		 * Kullanıcı klavyeden 45 girer.
		 * Çıktı olarak kırkbeş yazar
		 */
		System.out.println("Lütfen iki basamaklı bir sayı giriniz");
		Scanner tarayici = new Scanner(System.in);
		String[] birler = {"","bir","iki","üç","dört","beş","altı","yedi","sekiz","dokuz"};
		String[] onlar = {"","on","yirmi","otuz","kırk","elli","altmış","yetmiş","seksen","doksan"};
		int girilenSayi = tarayici.nextInt();
		int onlarBasamagi = girilenSayi /10;
		int birlerBasamagi = girilenSayi %10; //%mod almak için
		String okunus = onlar[onlarBasamagi] + birler[birlerBasamagi];
		System.out.println(okunus);
		
	}

}
