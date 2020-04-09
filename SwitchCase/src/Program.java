import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner tarayici = new Scanner(System.in);
		System.out.println("Trafik İsiginin rengini secin: K,S,Y");
		String harf = tarayici.nextLine();
		if (harf.toUpperCase().equals("K")) {
			System.out.println("Dur!");
		}
		
		else if (harf.toUpperCase().equals("S")) {
			System.out.println("Dikkat!");
		}
		
		else if (harf.toUpperCase().equals("Y")) {
			System.out.println("Gec!");
		}
		else {
			System.out.println("Farklı bir harfe tıkladınız");
		}
		
		switch (harf.toUpperCase()) {
		case "K":
			System.out.println("Dur!");
			break;
		case "S":
			System.out.println("Dikkat!");
			break;
		
		case "Y":
			System.out.println("Gec!");
			break;

		default:
			System.out.println("Farklı bir harfe tıkladınız");
			break;
		}
		
		System.out.println("Kart sembolünün ismini girin");
		String cevap = tarayici.nextLine();
		switch (cevap.toUpperCase()) {
		case "KARO":						
		case "KUPA":
			System.out.println("Kırmızı");
			break;		
		case "MAÇA":					
		case "SİNEK":
			System.out.println("Siyah");
			break;
		default:
			break;
		}
		
		
		
		
		
	}

}
