/**
 * this version of implementing singleton is not thread-safe since in a concurrent environment more than 1 instance could be created
 */
package singleton;
import java.lang.Thread;
/**
 * @author Jalal Choker
 * @since 2022-08-03
 */
public final class NonThreadSafeCache {
	
	public  String id;
	private NonThreadSafeCache(String id) {
		
		// simulate some work to try produce multiple instance scenario
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		
		this.id = id;
	}

	private static NonThreadSafeCache onlyInstance;

	public static NonThreadSafeCache getInstance(String id)  {
		
		if(onlyInstance == null)
		{
			onlyInstance =  new NonThreadSafeCache(id);			
		}

		return onlyInstance;
	}
}
