package abstractfactory.circles;

import abstractfactory.shapefactories.Shape;
/**
 * Pattern: Abstract Factory
 * 
 * @author Jalal Choker
 * @since 2022 - 08 - 20
 */
public abstract class Circle implements Shape {

	protected final int radius;

	protected Circle (int rad)
	{
		this.radius = rad;	
	}

	public abstract void draw();
}
