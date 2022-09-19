package abstractfactory.shapefactories;

import abstractfactory.triangles.*;
/**
 * Pattern: Abstract Factory
 * 
 * @author Jalal Choker
 * @since 2022 - 08 - 20
 */
public class TriangleFactory implements ShapeFactory {

	@Override
	public Shape getShape(ShapeType type) {

		var result =switch (type)
			{
				case EQUILATERAL_TRIANGLE -> new EquilateralTriangle();
				case ISOSCELES_TRIANGLE -> new IsoscelesTriangle();
				case RIGHT_TRIANGLE -> new RightTriangle();
				default -> null;
			};

		return result;
	}
}
