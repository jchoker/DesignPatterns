package abstractfactory.circles;
/**
 * Pattern: Abstract Factory
 * 
 * @author Jalal Choker
 * @since 2022 - 08 - 20
 */
public class MediumCircle extends Circle{

	public MediumCircle() {
		super(20);
	}

	@Override
	public void draw() {
		System.out.println("This is a medium circle with radius " + radius);
	}
}
