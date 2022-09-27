package prototype;

/**
 * Design Pattern: Prototype
 * 
 * @author Jalal Choker
 * @since 2022 - 08 - 21
 */
public class Car extends Vehicle {

	public String transmission;
	public Car(int seats,int tyres,String color, String transmission)
	{
		super(seats, tyres, color);
		this.transmission = transmission;
	}	

	public Car(Car that)
	{	
		super(that);
		if (that !=null)
			this.transmission = that.transmission;
	}

	@Override
	public Vehicle clone() {
		return new Car(this);
	}

	@Override
	public boolean equals(Object that) {
		if (!(that instanceof Car) || !super.equals(that)) return false;
		var thatCar = (Car)that;
		return thatCar.transmission == this.transmission;
	}
}
