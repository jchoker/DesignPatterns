package abstractfactory.circles;
/**
 * Pattern: Abstract Factory
 * 
 * @author Jalal Choker
 * @since 2022 - 08 - 20
 */
public class SmallCircle extends Circle{

	public SmallCircle() {
		super(5);
	}

	@Override
	public void draw() {
		System.out.println("This is a small circle with radius " + radius);
	}
}
