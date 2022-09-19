package abstractfactory.triangles;
/**
 * Pattern: Abstract Factory
 * 
 * @author Jalal Choker
 * @since 2022 - 08 - 20
 */
public class IsoscelesTriangle extends Triangle{

	public IsoscelesTriangle() {
		super(70, 70, 40);
	}

	@Override
	public void draw() {
		System.out.println("This is an isosceles triangle with angles " + angle1 + ", " + angle2 + ", " + angle3);
	}
}
