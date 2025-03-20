package pack1;

public class Car 
{
	String carname;
	float price;
	int ndoors, nseats;
	String color;
	
	public Car(String carname, float price, int ndoors, int nseats, String color) {
		this.carname = carname;
		this.price = price;
		this.ndoors = ndoors;
		this.nseats = nseats;
		this.color = color;
	}
	
//	public Car() {
//		// TODO Auto-generated constructor stub
//	}

	@Override
	public String toString() {
		return "Car [carname=" + carname + ", price=" + price + ", ndoors=" + ndoors + ", nseats=" + nseats + ", color="
				+ color + "]";
	}
}
