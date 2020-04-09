
public class En_kucuk_sayi_bulma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] sayılar = {13,15,100,45,-4,-8,0,-55,240};
		
		int enKucuk = sayılar[0];
		for (int i = 1; i < sayılar.length; i++) {
			if (enKucuk > sayılar[i]) {
				enKucuk = sayılar[i];
			}			
		}
		System.out.println("En kucuk sayı=" + enKucuk);
		
		//En büyük sayıyı bulma!
		
		int [] sayılar1 = {13,15,100,45,-4,-8,0,-55,240};
		
		int enBuyuk = sayılar1[0];
		for (int i = 1; i < sayılar1.length; i++) {
			if (enBuyuk< sayılar [i]) {
				enBuyuk =sayılar[i];
			}
			
		}
		System.out.println("En buyuk sayı="+ enBuyuk);
	}

}
