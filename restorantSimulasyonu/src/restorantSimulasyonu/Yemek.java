package restorantSimulasyonu;

import java.util.ArrayList;

public abstract class Yemek {
	//Tüm yemeklerin ............. vardır
	private ArrayList<String> malzemeler;
	private String ad;
	private double fiyat;
	private int pismeSuresi;
	
	//eğer metod abstract olacaksa class abstract olmak zorunda
	public abstract void Pisir(); 
		
	public void ServisEt() {
		System.out.println("Müşteriye verildi");
	}
}
