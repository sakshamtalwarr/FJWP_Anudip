package pack1;

public class MarutiDezire extends Car
{
	
	String features;
	String mileage;
	
	public MarutiDezire(String carname, float price, int ndoors, int nseats, String color, 
			String features, String mileage) 
	{
		super(carname, price, ndoors, nseats, color);
		this.features=features;
		this.mileage=mileage;
	}

	@Override
	public String toString() 
	{
		return super.toString()+"\n [features=" + features + ", mileage"+ mileage + "]";
	}
	
	
}
