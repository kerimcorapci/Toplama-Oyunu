package arabaSimulasiyonu;

public class Intro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Araba araba = new Araba(true);
		araba.Calistir();
		araba.GazaBas();
		System.out.println(araba.getAnlıkHız());
		araba.FreneBas();
		System.out.println(araba.getAnlıkHız());
		araba.Dur();
		araba.Calistir();
		
		for (int i = 0; i < 5; i++) {
			araba.GazaBas();
		}
		araba.GazaBas();
		araba.GazaBas();
		araba.GazaBas();
		araba.GazaBas();
		araba.GazaBas();
		System.out.println(araba.getAnlıkHız());
	}

}
