package oopTemelleri;

public class intro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Personel yazilimci = new Personel();
//		yazilimci.Ad = "T�rkay";
//		yazilimci.minimumMaas = -500;
		try {
			yazilimci.setMinimumMaas(1000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		double sonuc =yazilimci.getMinimumMaas();
		System.out.println(sonuc);
		
		
//		Personel yazilimci2 = yazilimci;
//		yazilimci2.Ad = "Kerim";
//		
//		System.out.println(yazilimci.Ad);
		
		yazilimci.setAd("Kerim");
		yazilimci.setSoyad("Corapci");
		
		
		
		
	}

}