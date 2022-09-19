package abstractfactory.triangles;
/**
 * Pattern: Abstract Factory
 * 
 * @author Jalal Choker
 * @since 2022 - 08 - 20
 */
public class RightTriangle extends Triangle{

	public RightTriangle() {
		super(90, 60, 30);
	}

	@Override
	public void draw() {
		System.out.println("This is a right triangle with angles " + angle1 + ", " + angle2 + ", " + angle3);
	}
}
