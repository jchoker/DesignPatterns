package abstractfactory.triangles;
/**
 * Pattern: Abstract Factory
 * 
 * @author Jalal Choker
 * @since 2022 - 08 - 20
 */
public class EquilateralTriangle extends Triangle{

	public EquilateralTriangle() {
		super(60, 60, 60);
	}

	@Override
	public void draw() {
		System.out.println("This is an equilateral triangle with angles " + angle1 + ", " + angle2 + ", " + angle3);
	}
}
