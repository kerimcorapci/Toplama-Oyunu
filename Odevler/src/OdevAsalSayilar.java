
public class OdevAsalSayilar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		
		
		for (int sayi = 1; sayi < 10001; sayi++) {
			boolean asalMi = true;
			
			for (int i = 2; i < sayi; i++) {
				if (sayi % i == 0) {
					asalMi = false;
					break;
				}
		}
			if (asalMi) {
				System.out.println(sayi);
						}
			
			//else {
				//System.out.println("Sayi asal degildir");
				// }
				
		}
		
		
	}

}
