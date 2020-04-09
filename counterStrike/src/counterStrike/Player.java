package counterStrike;

public class Player {
	private boolean isTerrorist = false;
	private String name;	
	private Weapon weaponOfPlayer;
	public boolean isTerrorist() {
		return isTerrorist;
	}
	public void setTerrorist(boolean isTerrorist) {
		this.isTerrorist = isTerrorist;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Weapon getWeaponOfPlayer() {
		return weaponOfPlayer;
	}
	public void setWeaponOfPlayer(Weapon weaponOfPlayer) {
		this.weaponOfPlayer = weaponOfPlayer;
	}
	
}
