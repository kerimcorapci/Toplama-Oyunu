import java.util.Scanner;

public class tekMiciftMi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ciftMiTest(10);
		
		
		
	
	}
	/**Bu fonksiyon girilen x sayısının çift olup olmadığını söyler*/
static void ciftMiTest (int x) {
	boolean sayiCift = false;
	
	if (x%2 == 0) {
		sayiCift = true;
		System.out.println(sayiCift);
		System.out.println("Girdiginiz sayi sift");
	}
	else {
		System.out.println("Girdiginiz sayi tek");
	}
	
}
	boolean ciftMi1 (int y) {
		return y % 2 == 0;
}
}
