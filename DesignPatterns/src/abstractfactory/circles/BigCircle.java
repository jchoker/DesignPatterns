package abstractfactory.circles;
/**
 * Pattern: Abstract Factory
 * 
 * @author Jalal Choker
 * @since 2022 - 08 - 20
 */
public class BigCircle extends Circle{

	public BigCircle() {
		super(50);
	}

	@Override
	public void draw() {
		System.out.println("This is a big circle with radius " + radius);
	}
}
