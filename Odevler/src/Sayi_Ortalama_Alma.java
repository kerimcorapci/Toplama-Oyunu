
public class Sayi_Ortalama_Alma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		int[] sayılar = {18,20,15,-3,40,86,77,38};
		
		int toplam =0;		
		for (int i = 0; i < sayılar.length; i++) {
			toplam += sayılar[i];
			
		}
		
		System.out.println(toplam);
		System.out.println("Girilen sayiların ortalaması:");
		System.out.println(toplam/sayılar.length);
	}

}
