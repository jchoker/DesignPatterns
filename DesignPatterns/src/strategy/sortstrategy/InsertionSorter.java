package strategy.sortstrategy;

import java.util.List;
/**
 * Pattern: Strategy
 * 
 * @author Jalal Choker
 * @since 2022 - 08 - 15
 */
public class InsertionSorter<T extends Comparable<T>> implements Sorter<T> {

	@Override
	public void sort(List<T> list) {

		// Proprietary implementation of insertion sort	
		for(var i = 1; i< list.size(); i++)
		{
			var j = i;
			 // swap while previous > current
			while(j > 0 && list.get(j-1).compareTo(list.get(j)) > 0)
			{
				// swap
				var t = list.get(j-1);
				list.set(j-1,list.get(j) );
				list.set(j,t);

				j--;
			}
		}		
	}
}
