package test;

import org.junit.jupiter.api.Test;

import factory.Canvas;

class FactoryTest {
	/**
	 * Design Pattern: Factory
	 * 
	 * @author Jalal Choker
	 * @since 2022 - 08 - 19
	 */
	@Test
	void testFactory()
	{		
		var canvas = new Canvas ();
		String [] shapeTypes  = {"RECTANGLE", "SQUARE","PENTAGON" };

		for (var type : shapeTypes)
			canvas.addShape(type);	
	}
}
