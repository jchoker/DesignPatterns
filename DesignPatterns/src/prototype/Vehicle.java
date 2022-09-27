package prototype;

import java.util.Objects;

/**
 * Design Pattern: Prototype
 * 
 * @author Jalal Choker
 * @since 2022 - 08 - 21
 */
public abstract class Vehicle {

	public int seats;
	public int tyres;
	public String color;
	protected Vehicle(int seats,int tyres,String color) // Default constructor
	{
		this.seats = seats;
		this.tyres = tyres;
		this.color = color;
	}	

	protected Vehicle(Vehicle that) // Copy constructor - It will create a new object and initialize this object from the existing object.
	{
		if (that !=null) {
			this.seats = that.seats;
			this.tyres = that.tyres;
			this.color = that.color;
		}
	}

	public abstract Vehicle clone();
	
	@Override
	public boolean equals(Object that)
	{
		if (!(that instanceof Vehicle)) return false;
		var thatVehicle = (Vehicle) that;
		return thatVehicle.seats == seats && thatVehicle.tyres == tyres && Objects.equals(thatVehicle.color, color);
	}
}
