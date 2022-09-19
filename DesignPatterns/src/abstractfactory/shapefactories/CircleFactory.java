package abstractfactory.shapefactories;

import abstractfactory.circles.*;
/**
 * Pattern: Abstract Factory
 * 
 * @author Jalal Choker
 * @since 2022 - 08 - 20
 */
public class CircleFactory implements ShapeFactory {

	@Override
	public Shape getShape(ShapeType type) {

		var result =switch (type)
				{
				case BIG_CIRCLE -> new BigCircle();
				case MEDIUM_CIRCLE -> new MediumCircle();
				case SMALL_CIRCLE -> new SmallCircle();
				default -> null;
				};

		return result;
	}
}
