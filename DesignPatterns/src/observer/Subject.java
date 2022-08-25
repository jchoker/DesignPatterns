package observer;

/**
 * Pattern: Observer
 * 
 * @author Jalal Choker
 * @since 2022 - 08 - 12
 */
public interface Subject
{
	void register(Observer newObserver);
	void unregister(Observer observer);
	void notifyObservers();
}