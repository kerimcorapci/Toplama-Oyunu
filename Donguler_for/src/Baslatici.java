import java.util.Scanner;

public class Baslatici {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] sayılar = {18,20,15,-3};
		
		for(int i=1; i<100; i++ ) {
			System.out.println(i);
			System.out.println("Selam!");
		}
		
		
		 int toplam =0;
		 /*
		toplam+= sayılar[0];
		toplam+= sayılar[1];
		toplam+= sayılar[2];
		toplam+= sayılar[3];
		*/
		
		
		for (int i = 0; i < sayılar.length; i++) {
			toplam += sayılar[i];
			
		}
		
		System.out.println(toplam);
		
		//dizi içindeki en küçük sayıyı bulun:
		
		int enKucuk = sayılar[0];
		for (int i = 1; i < sayılar.length; i++) {
			if (enKucuk > sayılar[i]) {
				enKucuk = sayılar[i];
			}			
		}
		System.out.println(enKucuk);
		
		
		System.out.println("Bir kelime girin:");
		Scanner okur = new Scanner(System.in);
		String arananKelime = okur.nextLine().toLowerCase();
		
		
		String[] kelimeler = {"telefon","laptop","deneme"};
		boolean kelimeVarmi = false;
		for (int i = 0; i < kelimeler.length; i++) {
			if (kelimeler[i].equals(arananKelime)) {
				kelimeVarmi = true;
				System.out.println("Kelimenin index numarası=" + i);
				
			}
		}
		if (kelimeVarmi) {
			System.out.println("Kelime vardır");
			
			
		}
		else {
			System.out.println("Kelime yoktur");
		}
	}

}
