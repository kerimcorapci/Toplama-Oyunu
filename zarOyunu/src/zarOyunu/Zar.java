package zarOyunu;

import java.util.Random;

public class Zar {
	public int getZarDegeri() {
		Random uretici = new Random();
		int sayi = uretici.nextInt(6-1)+1;
		return sayi;
	}
}
