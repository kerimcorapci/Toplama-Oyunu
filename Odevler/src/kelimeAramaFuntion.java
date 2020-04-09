
public class kelimeAramaFuntion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String [] kelimeler = {"kerim","türkay","enis","doruk","deneme"};
		//for (int i = 0; i < kelimeler.length-1; i++) {
			//System.out.println(kelimeler[i]);
		//}
		 String [] kelimeler = {"kerim","türkay","enis","doruk","deneme"};
		
		kelimeArama("Kerim");
		boolean sonuc = kelimeVarMi("kerim",kelimeler);
		if (sonuc) {
			System.out.println("Kelime vardır");
		}
		else {
			System.out.println("Kelime yoktur");
		}

	}
	/**Bu fonksiyon girilen kelimenin Array içinde olup olmadığını söyler */
 static void kelimeArama (String aranacakKelime ) {
	 String [] kelimeler = {"kerim","türkay","enis","doruk","deneme"};
	
 }
 static boolean kelimeVarMi (String aranacakKelime, String[] kelimeler) {
	 
	 for (String kelime : kelimeler) {
			if (aranacakKelime.toLowerCase().equals(kelime)) {
				return true;
			}		
		} 
	 return false;
 }
 }
