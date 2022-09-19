package abstractfactory.shapefactories;
/**
 * Pattern: Abstract Factory
 * 
 * @author Jalal Choker
 * @since 2022 - 08 - 20
 */
public interface ShapeFactory {
	Shape getShape(ShapeType type);
}
