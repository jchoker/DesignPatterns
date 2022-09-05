package strategy.sortstrategy;

import java.util.List;
/**
 * Pattern: Strategy
 * 
 * @author Jalal Choker
 * @since 2022 - 08 - 15
 */
public interface Sorter<T> {

	void sort(List<T> collection);
}
