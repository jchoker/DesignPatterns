package strategy.displaystrategy;

import java.util.List;
/**
 * Pattern: Strategy
 * 
 * @author Jalal Choker
 * @since 2022 - 08 - 15
 */
public class ReverseOrderDisplayer<T> implements Displayer<T>{

	/**
	 * Displays items in reverse order.
	 */
	@Override
	public void display(List<T> collection) {
		for (var  i = collection.size () - 1 ; i >= 0 ; i--)
			System.out.print("(" + collection.get(i) + ")  ");
		
		System.out.println ();		
	}
}
