import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Önce eylem sonra koşul
		String sifre = "";
		Scanner tarayici = new Scanner(System.in);
		do {
			System.out.println("Siferyi girin:");
			sifre = tarayici.nextLine();
		} while (!sifre.equals("123"));
		
		System.out.println("Sifre dogru");
	}

}
