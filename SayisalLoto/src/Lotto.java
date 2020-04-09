import java.util.Arrays;
import java.util.Random;

public class Lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] sayisal = new int[6];
		Random uretici = new Random();
		
		int cekilenTopSayisi =0;
		while (cekilenTopSayisi<6) {
			System.out.println(cekilenTopSayisi);
			int rastgeleSayi = uretici.nextInt(49)+1; // 1 ile 49 arasında sayı vericek
			if (Arrays.binarySearch(sayisal, rastgeleSayi)<0) {
				sayisal[cekilenTopSayisi] = rastgeleSayi;
				cekilenTopSayisi++;
			}			
		}
		
		//1, 5, 3, 4, 2
		for (int i = 0; i < sayisal.length-1; i++) {
			for (int j = i+1; j < sayisal.length; j++) {
				if (sayisal[i]> sayisal[j]) {
					
					int gecici = sayisal[i];
					sayisal[i]= sayisal[j];
					sayisal[j]= gecici;
					
				}
			}
		}
		
		
		 for (int i = 0; i < sayisal.length; i++) {
			System.out.print(sayisal[i]+ "-");
		}
		
		
	}

}
