package recursiveFunction;

public class Intro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ebob = ebob(1278, 36);
		System.out.print(ebob);
	}
	static int ebob(int sayi1, int sayi2) {
	if (sayi1 != 0 && sayi2 != 0) {
		int kalan = sayi1 % sayi2;
		sayi1 = sayi2;
		sayi2 = kalan;
	return	ebob(sayi1, sayi2);
	} else {
		return sayi1;
	}

 }
}


