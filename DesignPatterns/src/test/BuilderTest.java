package test;

import org.junit.jupiter.api.Test;

import builder.Car;
import builder.CarType;
import builder.Engineer;

/**
 * @author Jalal Choker
 * @since 01-08-2022
 */
class BuilderTest {	

	@Test
	void testBuilder(){

		// the job of constructing the desired car is delegated to the engineer(technical know how),
		// the client code is unaware of the construction process (robot does the job)
		Car car;

		var director = new Engineer();

		director.setRequest(CarType.SPORTS_CAR);		
		car = director.getCar();
		System.out.println();
		System.out.println(car);
		System.out.println("==========");	


		director.setRequest(CarType.SUV);
		car = director.getCar();
		System.out.println();
		System.out.println(car);
		System.out.println("==========");
	}
}
