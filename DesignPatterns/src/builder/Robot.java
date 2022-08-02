/**
 * The robot (Builder) is responsible for building new cars, it defines all possible ways to make a car.
 */
package builder;

/**
 * @author Jalal Choker
 * @since 01-08-2022
 */
interface Robot {
	
	void newCar();
	
	Car getCar();

	void startCar();

	void addSeats();
	
	void configureMechanics();
	
    void setOptions();
    
	void testDrive();
}
