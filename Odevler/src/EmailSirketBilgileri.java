
public class EmailSirketBilgileri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] epostaAdresleri = {"deneme@mynet.com", "turkay.urkmez@dinamikzihin.com","kerim@philips.com", "deniza@microsoft.com", "ali@gmail.com","abc@yahoo.com"};
		//eposta adresleri; mynet, hotmail, yahoo, gmail olanlar hariç diğer bütün mail adreslerinin şirket bilgilerini almak istiyorum.
		/*
		 * mailleri yukarıda verilen mail uzantıları ile kaşılaştır
		 * gerekli olanları al yeni bir String[] olarak kaydet
		 * gerkli String[] i
		 * @ dan sonra ayır
		 * @ dan sonyayı da .com u almayacak şekilde yap son 4 yok
		 * @ öncesi ayır
		 * @ öncesi çalışanın adı 
		 * @sonrası çalıştığı şirket olacak
		 * for each mail eğer kelime yoksa durdur
		 * eğer kelime varsa böl ve print
		 * 
		 */
		String[] yasakDomainler = {"mynet","hotmail","yahoo","gmail"};
		for (String yasak : yasakDomainler) {
			
		
		for (String eposta : epostaAdresleri) {
			String []domainler = eposta.split("@",2);			
			String mailDomain = domainler[1];		
			//System.out.println(mailDomain);
			
			if (!mailDomain.startsWith(yasak)) {
				System.out.println(mailDomain);
				
			}
		}	
	}
		
		
		
		
		
		for (String eposta : epostaAdresleri) {
			
		String[] arr = eposta.split("@");
		String sirket = arr[arr.length-1];
		//System.out.println(sirket);
		
		
		//?? sirket.substring(0, sirket.length()-4);
		
		//for (String sirketAdi : epostaAdresleri) {
			//String[]aa = sirketAdi.split(".");
			//System.out.println(sirketAdi);
			//String sirketAdiSon = aa[aa.length-1];
			//System.out.println(sirketAdiSon);

		
		}	  

	}

}