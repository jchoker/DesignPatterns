package prototype;

/**
 * Design Pattern: Prototype
 * 
 * @author Jalal Choker
 * @since 2022 - 08 - 21
 */
public class Bike extends Vehicle {

	public int gears;
	public Bike(int seats,int tyres,String color, int gears)
	{
		super(seats, tyres, color);
		this.gears = gears;
	}	

	public Bike(Bike that)
	{	
		super(that);
		if (that !=null)
			this.gears = that.gears;
	}

	@Override
	public Vehicle clone() {
		return new Bike(this);
	}

	@Override
	public boolean equals(Object that) {
		if (!(that instanceof Bike) || !super.equals(that)) return false;
		var thatBike = (Bike) that;
		return thatBike.gears == this.gears;
	}
}
