/**
 * In a given system there can exist only one instance of Cache type, however this simplified version of implementing singleton is not thread-safe
 */
package singleton;

/**
 * @author Jalal Choker
 * @since 2022-08-03
 */
public class NaiveCache {
	
	private NaiveCache() {}

	private static NaiveCache onlyInstance=null; // alternatively, this field can be eagerly initialized (one approach of making it thread-safe)

	public static NaiveCache getInstance() {
		
		// lazy initialization
		if(onlyInstance == null) onlyInstance =  new NaiveCache(); // this code block is subject to race condition

		return onlyInstance;
	}
}
