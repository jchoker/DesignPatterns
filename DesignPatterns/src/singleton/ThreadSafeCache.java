/**
 * this version of implementing singleton is thread-safe, in a concurrent environment only 1 instance is created
 */
package singleton;
import java.lang.Thread;
/**
 * @author Jalal Choker
 * @since 2022-08-03
 */
public class ThreadSafeCache {
	
	public String id;
	private ThreadSafeCache(String id) {
		
		// simulate some work
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		
		this.id = id;
	}

	private static ThreadSafeCache onlyInstance;

	public static ThreadSafeCache getInstance(String id)  {
		
		// double-checked locking (DCL) technique
		if(onlyInstance == null)
		{
			synchronized(ThreadSafeCache.class) {
				if(onlyInstance == null)
				{
					onlyInstance =  new ThreadSafeCache(id);			
				}
			}
		}

		return onlyInstance;
	}
}