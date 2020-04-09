
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] harita = {"w","w","w","x","p","q","q","w"}; 
		//haritada x'i bul:
		int index = 0;
		int bulunanIndex = -1;
		while (index < harita.length) {
			String element = harita[index];
			if (element.equals("x")) {
				bulunanIndex = index;			
			 }
			index++;
		  }
		
		if (bulunanIndex == -1) {
			System.out.println("Bulunamamistir");
		}	
		else {
			System.out.println("x degerinin pozisyonu "  +  bulunanIndex);
		}
		
		}
		
	}

