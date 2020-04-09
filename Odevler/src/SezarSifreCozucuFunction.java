
public class SezarSifreCozucuFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String sonuc =	sifrele("kerim");
			System.out.println(sonuc);
			
	
	
	}		
	
	static String sifrele (String sifrelenecekmetin){
		String yenikelime ="";
		for (int i = 0; i < sifrelenecekmetin.length(); i++) {
			char kar1 = sifrelenecekmetin.charAt(i);
			int ascii = (int)kar1;
			int yeniHarfAscii2 = (2*(ascii)-1);
			char yeniHarf2 = (char)yeniHarfAscii2;
			yenikelime += yeniHarf2;
}
			return yenikelime;
	}
	
}