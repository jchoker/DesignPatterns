package test;

import org.junit.jupiter.api.Test;

import abstractfactory.shapefactories.*;

class AbstractFactoryTest {
	/**
	 * Pattern: Abstract Factory
	 * 
	 * @author Jalal Choker
	 * @since 2022 - 08 - 20
	 */
	@Test
	void testAbstractFactory()
	{		
		Shape shape;
		
		/*
		 * The triangle factory only creates shapes of type triangle. This way we assure
		 * to clients receiving concrete implementations of  ShapeFactory that all
		 * created shapes belong to the same family/group.
		 */
		ShapeFactory triFactory = new TriangleFactory ();
		shape = triFactory.getShape(ShapeType.EQUILATERAL_TRIANGLE);
		shape.draw();
		shape = triFactory.getShape(ShapeType.ISOSCELES_TRIANGLE);
		shape.draw();
		shape = triFactory.getShape(ShapeType.RIGHT_TRIANGLE);
		shape.draw();
		
		// the circle factory only creates shapes of type circle
		var crclFactory = new CircleFactory(); // change factory
		shape = crclFactory.getShape(ShapeType.BIG_CIRCLE);
		shape.draw();
		shape = crclFactory.getShape(ShapeType.MEDIUM_CIRCLE);
		shape.draw();
		shape = crclFactory.getShape(ShapeType.SMALL_CIRCLE);
		shape.draw();
	}
}
