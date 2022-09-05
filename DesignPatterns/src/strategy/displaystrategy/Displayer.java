package strategy.displaystrategy;

import java.util.List;
/**
 * Pattern: Strategy
 * 
 * @author Jalal Choker
 * @since 2022 - 08 - 15
 */
public interface Displayer<T> {
	
	 void display(List<T> collection);
}
