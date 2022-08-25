package observer;
/**
 * Pattern: Observer
 * 
 * @author Jalal Choker
 * @since 2022 - 08 - 12
 */
public class StockObserver implements Observer 
{

	private static int observerIdTracker = 0;

	public final int id;

	public final Subject stockGrabber;
	public StockObserver(Subject stockGrabber)
	{
		this.stockGrabber = stockGrabber;
		stockGrabber.register(this); // subscribes to publisher on the fly
		id = ++observerIdTracker; // assign a sequential id
		System.out.println("New observer " + id);	
	}

	private double aplPrice;
	private double gglPrice;
	private double mcrPrice;

	public void update(double aplPrice, double gglPrice,double mcrPrice)
	{
		this.aplPrice = aplPrice; this.gglPrice= gglPrice; this.mcrPrice= mcrPrice;
		displayPrices();
	}

	private void displayPrices()
	{
		System.out.println("Observer "+ id +":" + "\nApple stock price " + aplPrice + "\nGoogle stock price " + gglPrice+ "\nMicrosoft stock price " + mcrPrice);
	}
}