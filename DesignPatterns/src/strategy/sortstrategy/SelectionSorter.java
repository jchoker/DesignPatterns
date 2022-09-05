package strategy.sortstrategy;

import java.util.List;
/**
 * Pattern: Strategy
 * 
 * @author Jalal Choker
 * @since 2022 - 08 - 15
 */
public class SelectionSorter<T extends Comparable<T>> implements Sorter<T> {

	@Override
	public void sort(List<T> list) {
		
		// Proprietary implementation of selection sort	
		for(var i = 0; i< list.size(); i++)
		{
			var j = i;
			var idxMin = j; var min = list.get(idxMin);			

			for(; j< list.size(); j++)
			{
				var cur = list.get(j);
				if(cur.compareTo( min) < 0)
				{
					min = cur; idxMin = j;
				}
			}

			// swap if initialzed min has changed
			if(i != idxMin)
			{
				var tmp = list.get(i);
				list.set(i,min );
				list.set(idxMin,tmp);
			}
		}		
	}
}
