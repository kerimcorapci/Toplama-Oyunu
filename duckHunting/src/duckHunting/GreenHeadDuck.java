package duckHunting;
//Bir sınıf sadece bir sınıftan miras alır, birçok interface'i implemente edebilir.
public class GreenHeadDuck extends Duck implements Flyable, IFastable{

	@Override
	public void Swimming() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Walking() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Flying() {
		// TODO Auto-generated method stub
		
	}
	int high =50;
	@Override
	public int getHigh() {
		// TODO Auto-generated method stub
		return high;
	}

	@Override
	public void setHigh(int value) {
		// TODO Auto-generated method stub
		this.high = value;
	}


}
