import java.util.Scanner;

public class BmiOdev2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner tarayici = new Scanner(System.in);
		
		//örnek: Boy kilo endeksini bulalım:
		//kilo / (boy * boy):
		System.out.println("Kilonuzu girin:");
		
		int kilo = tarayici.nextInt();
		System.out.println("Boyunuzu metre cinsinden girin:");
		double boy = tarayici.nextDouble();
		double bmi = kilo/ (boy* boy);
		System.out.println("Vücut kitle indeksiniz");
		System.out.println(bmi);
		
		if (bmi>30) {
			System.out.println("Obezsiniz:");	
			
		}
		
		if (bmi<20) {
			System.out.println("Kilo Almalisiniz");
			
		} 
		
		else {
			System.out.println("Sagliklisiniz");

		}
		
	}

}
