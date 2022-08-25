package observer;

import java.util.List;
import java.util.ArrayList;

/**
 * Pattern: Observer
 * 
 * @author Jalal Choker
 * @since 2022 - 08 - 12
 */
public class StockGrabber implements Subject
{
	private final List<Observer> observers;

	private double aplPrice; private double gglPrice ; private double  mcrPrice;

	public StockGrabber()
	{
		observers = new ArrayList<Observer>();
	}

	public void register( Observer newObserver ){observers.add(newObserver);}

	public void unregister(Observer observer)
	{
		var idx = observers.indexOf(observer);
		observers.remove(idx);
		System.out.println("Unregistered the " + (idx + 1) + " observer.");
	}

	public void notifyObservers() 
	{
		for(var ob : observers)
			ob.update(aplPrice, gglPrice,mcrPrice);
	}

	public void setAplPrice(double p)
	{
		if(aplPrice != p) // notify observers when prices really change, avoid fake notifications
		{
			aplPrice = p;
			notifyObservers() ;
		}
	}

	public void setGglPrice(double p)
	{
		if(gglPrice  != p)
		{
			gglPrice = p;
			notifyObservers() ;
		}
	}

	public void setMcrPrice(double p)
	{
		if(mcrPrice != p)
		{
			mcrPrice= p;
			notifyObservers() ;
		}
	}
}