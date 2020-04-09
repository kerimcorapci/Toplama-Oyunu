package counterStrike;

public class Sniper extends Gun {
	
	private double zoomRate = 1.5;

	public double getZoomRate() {
		return zoomRate;
	}

	public void setZoomRate(double zoomRate) {
		this.zoomRate = zoomRate;
	}
	
	@Override
	public void ChangeAmmo() {
		// TODO Auto-generated method stub
		System.out.println("Sniper şarjörü değişiyor!");
	}
	
}
