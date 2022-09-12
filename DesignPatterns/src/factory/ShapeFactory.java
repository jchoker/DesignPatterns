package factory;

import factory.shapes.*;
/**
 * Design Pattern: Factory
 * 
 * @author Jalal Choker
 * @since 2022 - 08 - 19
 */
public class ShapeFactory {
	/**
	 * Alternatively, make ShapeFactory abstract and have TriangleShapeFactory, RectangleShapeFactory etc.. for drawing different sets of shapes.
	 */
	public Shape getShape(String type)
	{
		if(type == null) return null;

		var lcType = type.toLowerCase();

		switch(lcType)
		{
		case "circle": return new Circle();
		case "rectangle": return new Rectangle();
		case "square": return new Square();
		case "triangle": return new Triangle();
		default:
			System.out.println ("A " + lcType.toLowerCase() + " is an undefined shape for this program.");
			return null;
		}
	}
}
