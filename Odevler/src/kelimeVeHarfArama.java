import java.util.Scanner;

public class kelimeVeHarfArama {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner okur = new Scanner(System.in);
		System.out.println("Lütfen bir kelime giriniz:");
		String girilenKelime = okur.nextLine();
		System.out.println("Lütfen kelimede aranacak harfi giriniz:");
		String girilenHarf = okur.nextLine();

		
//		String kelime2 = "ayna";		
//		int sonuc1 =kelime2.indexOf("a",0);
//		System.out.println(sonuc1);
//		int sonuc2 =kelime2.indexOf("a",1);
//		System.out.println(sonuc2);
//		sonuc1 =kelime2.indexOf("a",4);
//		System.out.println(sonuc1);
				
		int baslangicIndexi = 0;
		String harfinYerleri = "";
		while (girilenKelime.indexOf(girilenHarf,baslangicIndexi)!= -1) {
			
			int harfinIndexi = girilenKelime.indexOf(girilenHarf,baslangicIndexi);
			harfinYerleri += harfinIndexi +", ";
			baslangicIndexi = harfinIndexi +1;
			
		}
		System.out.println(girilenKelime +" kelimesinde a harfinin yerleri: " + harfinYerleri);

	}

}
