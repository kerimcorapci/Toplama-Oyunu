package counterStrike;

public class Gun extends Weapon{
	
	private int maxAmmo;
	private int maxAmmoCount;
	
	private double renewAmmoDuration;

	public int getMaxAmmo() {
		return maxAmmo;
	}

	public void setMaxAmmo(int maxAmmo) {
		this.maxAmmo = maxAmmo;
	}

	public int getMaxAmmoCount() {
		return maxAmmoCount;
	}

	public void setMaxAmmoCount(int maxAmmoCount) {
		this.maxAmmoCount = maxAmmoCount;
	}

	public double getRenewAmmoDuration() {
		return renewAmmoDuration;
	}

	public void setRenewAmmoDuration(double renewAmmoDuration) {
		this.renewAmmoDuration = renewAmmoDuration;
	}
	
	public void ChangeAmmo() {
		System.out.println("Şarjör değiştiriliyor: Varsayılan tabanca");
	}
	
	
}
