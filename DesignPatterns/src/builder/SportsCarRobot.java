/**
 * Concrete robots implement steps defined in the common interface.
 * Visible only within builder package, client doesn't need to know about its existence
 */
package builder;

import java.util.Arrays;

/**
 * @author Jalal Choker
 * @since 01-08-2022
 */
class SportsCarRobot implements Robot {

	private Car car;	
	/*
	 * This robot only builds Sports Cars.
	 */

	@Override
	public void newCar() {
		this.car= new ConcreteCar();
		this.car.setType(CarType.SPORTS_CAR);
		System.out.println ("Initiated process of creating " + CarType.SPORTS_CAR);
	}

	@Override
	public void startCar() {
		System.out.println ("Car started successfully!");
	}

	@Override
	public void addSeats() {
		this.car.setSeats(2);		
	}

	@Override
	public void configureMechanics() {
		this.car.setEngine("volume - 3.0; mileage - 0.0");
		this.car.setTransmission("MANUAL");
	}

	@Override
	public void setOptions() {
		var options = Arrays.asList("Antilock braking systems","adjustable pedals", "leather seats","sunroof");
		this.car.setOptions(options);		
	}

	@Override
	public void testDrive() {
		System.out.println ("Drive testing done.");		
	}

	@Override
	public Car getCar() {
		return car;
	}
}
