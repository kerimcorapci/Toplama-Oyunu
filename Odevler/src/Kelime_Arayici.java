import java.util.Scanner;

public class Kelime_Arayici {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Bir kelime girin:");
		Scanner okur = new Scanner(System.in);
		String arananKelime = okur.nextLine().toLowerCase();
		//String [] arananKelime2 = {""};
		
		String[] kelimeler = {"telefon","laptop","deneme","araba"};
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
