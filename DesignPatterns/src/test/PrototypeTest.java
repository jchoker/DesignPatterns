package test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import prototype.*;

class PrototypeTest {
	/**
	 * Design Pattern: Prototype
	 * 
	 * @author Jalal Choker
	 * @since 2022 - 08 - 21
	 */
	@Test
	void testPrototype()
	{		
        List<Vehicle> vehicles = new ArrayList<>();
        List<Vehicle> copies = new ArrayList<>();		
		
        Vehicle bike = new Bike(1, 2, "Black", 21);
        vehicles.add(bike);
        Vehicle car = new Car(4, 4, "White", "Manual");
        vehicles.add(car);
        
        cloneAndCompare(vehicles, copies);
	}

	private static void cloneAndCompare(List<Vehicle> vehicles, List<Vehicle> copies) {
		
		for (var vcl : vehicles) copies.add(vcl.clone());
		
        for (int i = 0; i < vehicles.size(); i++) {
        	
        	var vehicle= vehicles.get(i);
        	var copy = copies.get(i);        	
        	
        	Assert.assertNotSame(i + ": Vehicle objects are the same", copy, vehicle); // assert instances different
        	Assert.assertTrue(i + ": They are not identical", vehicle.equals(copy)); // assert objects equivalent/identical
        }
	}
}
