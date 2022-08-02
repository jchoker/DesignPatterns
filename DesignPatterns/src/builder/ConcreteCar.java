package builder;

import java.util.List;

/**
 * @author Jalal Choker
 * @since 01-08-2022
 */
public class ConcreteCar implements Car {

	private CarType type;
	private String engine;
	private String transmission;
	private int seats;
	List<String> options;

	@Override
	public void setType(CarType type) {
		this.type = type;		
	}

	@Override
	public void setEngine(String engine) {
		this.engine = engine;		
	}

	@Override
	public void setTransmission(String transmission) {
		this.transmission = transmission;
	}

	@Override
	public void setSeats(int seats) {
		this.seats = seats;
	}

	@Override
	public void setOptions(List<String> options) {
		this.options = options;
	}

	public String toString ()
	{
		String car = "This is a car of type " + this.type + ", with specifications " + 
				this.engine.toString() +  " engine and "  
				+ this.transmission + " transmission. Drive safely!";
		return car;
	}
}
