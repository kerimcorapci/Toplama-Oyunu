import java.util.Scanner;

public class VizeFinalNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tarayici = new Scanner(System.in);
		

		System.out.println("Lütfen Vize Notunuzu giriniz:");
		int vizeNotu = tarayici.nextInt();
		
		System.out.println("Lütfen Final Notunuzu giriniz:");
		int finalNotu = tarayici.nextInt();
		
		double vizeNotuAgirligi = 0.35;
		double finalNotuAgirligi = 0.65;
		
		System.out.println("Ortalamanız:");
		double notunuz = ((vizeNotuAgirligi*vizeNotu)+(finalNotu*finalNotuAgirligi));
		System.out.println(notunuz);
		
		if (notunuz==100) {
			System.out.println("Notunuz:A++");
		}

		else if (notunuz>90) {
			System.out.println("Notunuz:A");
		}
		
		else if (notunuz>80) {
			System.out.println("Notunuz:B");
		}
		
		else if (notunuz>70) {
			System.out.println("Notunuz:C");
		}
		
		else if (notunuz>60) {
			System.out.println("Notunuz:D");
		}
		
		else  {
			System.out.println("Kaldınız");
		}
		
		
		
	}

}
