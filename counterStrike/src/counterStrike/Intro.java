package counterStrike;

public class Intro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sniper kanas = new Sniper();
		Pistol mini = new Pistol();
		
		Player oyuncu1 = new Player();
		oyuncu1.setWeaponOfPlayer(kanas);
		
		Player oyuncu2 = new Player();
		oyuncu2.setWeaponOfPlayer(mini);
		
		//getWeapon bana weapon döndürüyor
		//Type casting:
		//Silah tipini ateşliSilah tipine dönüştür.
		Gun atesliSilah = (Gun) oyuncu1.getWeaponOfPlayer();
		atesliSilah.ChangeAmmo();
	}

}