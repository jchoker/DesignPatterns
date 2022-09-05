package strategy.displaystrategy;

import java.util.List;
/**
 * Pattern: Strategy
 * 
 * @author Jalal Choker
 * @since 2022 - 08 - 15
 */
public class NaturalOrderDisplayer<T> implements Displayer<T>{

	/**
	 * Displays items in natural order.
	 */
	@Override
	public void display(List<T> collection) {
		for(var x : collection)		
			System.out.print("(" + x + ")  ");
		
		System.out.println ();		
	}
}
