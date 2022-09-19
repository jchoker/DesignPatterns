package abstractfactory.triangles;

import abstractfactory.shapefactories.Shape;
/**
 * Pattern: Abstract Factory
 * 
 * @author Jalal Choker
 * @since 2022 - 08 - 20
 */
public abstract class Triangle implements Shape {

	protected final double angle1, angle2, angle3;
	
	protected Triangle (double ang1, double ang2, double ang3)
	{
		this.angle1 = ang1;
		this.angle2 = ang2;
		this.angle3 = ang3;		
	}

	public abstract void draw();
}
