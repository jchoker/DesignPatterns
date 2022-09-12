package factory;

import factory.shapes.Shape;
/**
 * Design Pattern: Factory
 * 
 * @author Jalal Choker
 * @since 2022 - 08 - 19
 */
public class Canvas {

	private final ShapeFactory factory;

	/**
	 * Alternatively, to avoid tight coupling between the 2 classes ShapeFactory & Canvas,
	 * change ShapeFactory to be an interface & create factory implementations of it whose
	 * responsiblities will be to create a specific shape. 
	 * Then modify Canvas c'tor to accept a ShapeFactory parameter
	 */
	public Canvas()
	{
		this.factory = new ShapeFactory();
	}

	private Shape shape;
	public void addShape(String type)
	{
		shape = factory.getShape(type);
		if (shape != null)
			shape.draw();
	}
}
