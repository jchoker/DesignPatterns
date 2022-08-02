package builder;

import java.util.Arrays;

/**
 * @author Jalal Choker
 * @since 01-08-2022
 */
class SUVCarRobot implements Robot {

	private Car car;
	
	/*
	 * This robot only builds SUV Cars.
	 */
	
	@Override
	public void newCar() {
		this.car= new ConcreteCar();
		this.car.setType(CarType.SUV);
		System.out.println ("Initiated process of creating " + CarType.SUV);
	}

	@Override
	public void startCar() {
		System.out.println ("Car started successfully!");
	}

	@Override
	public void addSeats() {
		this.car.setSeats(4);		
	}

	@Override
	public void configureMechanics() {
		this.car.setEngine("volume - 2.0; mileage - 100.0");
		this.car.setTransmission("AUTOMATIC");
	}

	@Override
	public void setOptions() {
		var options = Arrays.asList("Antilock braking systems","adjustable pedals");
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
