/**
 * The Engineer (Director) defines the order in which to execute the assembling steps, while the Robot (builder) provides the implementation for those steps.
 */
package builder;

/**
 * @author Jalal Choker
 * @since 01-08-2022
 */
public class Engineer {	

	private Car car;
	private Robot robot;

	public Car getCar() {
		return car;
	}

	/*
	 * Engineer receives the car request and calls an appropriate robot to assemble the car, 
	 * and instructs the robot of the steps of assembling and testing the requested car.
	 * 
	 */
	
	public void setRequest (CarType type)
	{		
		robot = switch(type)
				{
				case  SPORTS_CAR ->  new SportsCarRobot ();
				case  SUV ->  new SUVCarRobot ();
				default -> null;
				};

				if (robot != null)
				{
					assembleCar();
					car = robot.getCar();
					robot = null;
				}
				else
				{
					car = null; // reset car object if no appropriate robot found to assemble desired car
					System.out.println("Our robots do not know how to build " + type +  " car. Please tell us how to do so!");
				}
	}

	void assembleCar ()
	{
		robot.newCar();		
		robot.configureMechanics();
		robot.addSeats();
		robot.setOptions();
		robot.startCar();
		robot.testDrive();		
	}
}