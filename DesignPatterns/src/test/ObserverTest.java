package test;

import org.junit.jupiter.api.Test;

import observer.StockGrabber;
import observer.StockObserver;
/**
 * Pattern: Observer
 * 
 * @author Jalal Choker
 * @since 2022 - 08 - 12
 */
class ObserverTest {

	@Test
	void testObserver()
	{
		// the stock grabber is the subject
		var stkGrbr = new StockGrabber();

		// 2 new observers subscribe to the publisher
		var obs1 = new StockObserver(stkGrbr);
		var obs2 = new StockObserver(stkGrbr);

		stkGrbr.setAplPrice(100); // apple stock price changes as a result all registered observers will be notified

		var obs3 = new StockObserver(stkGrbr); // another observer subscribes to the publisher
		stkGrbr.setGglPrice(200); // now 3 observers are notified

		stkGrbr.unregister(obs2); // observer 2 no longer wishes to subscribe to prices change
		stkGrbr.setMcrPrice(300);
	}
}
