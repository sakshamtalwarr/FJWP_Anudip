package pack1;

public class Farari extends Car 
{
	String features;
	String speed;
	public Farari(String carname, float price, int ndoors, int nseats, String color, 
			String features, String speed) {
		super(carname, price, ndoors, nseats, color);
		this.features = features;
		this.speed = speed;
	}
	@Override
	public String toString() 
	{
		
		return super.toString()+"\n features=" + features + ", speed=" + speed + "]";
	}
	
	
}
