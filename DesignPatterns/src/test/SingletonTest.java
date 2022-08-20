package test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import singleton.*;

/**
 * @author Jalal Choker
 * @since 2022-08-03
 */
class SingletonTest {	

	@Test
	void testNaiveCache(){
		
		// multiple references to the same actual object (single instance)
		var r1 = NaiveCache.getInstance();
		var r2 = NaiveCache.getInstance();
		var r3 = NaiveCache.getInstance();

		assertEquals(r1.hashCode(),r2.hashCode());
		assertEquals(r2.hashCode(),r3.hashCode());
		
		// assert references point to the same address in heap memory i.e same object
		assertEquals(r1,r2);
		assertEquals(r2,r3);
	}
	
	
	@Test
	void testNonThreadSafeCache() throws InterruptedException{		
        System.out.println("Testing non Thread-Safe cache:");        
        System.out.println("If you see the same value, then singleton was reused" + "\n" +
                "If you see different values, then 2 singletons were created" + "\n\n" +
                "RESULT:" + "\n");
		
		Thread t1 = new Thread(new Thread1());
		Thread t2 = new Thread(new Thread2());		

		// this code doesn't produce consistent results / code is subject to race condition
		// occasionally it might create multiple cache instances depending on the OS thread scheduling
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
	}
	
	class Thread1 implements Runnable
	{
		@Override
		public void run() {
			var cache  = NonThreadSafeCache.getInstance("Alpha");
            System.out.println(cache.id);
		}		
	}
	
	class Thread2 implements Runnable
	{
		@Override
		public void run() {
			var cache  = NonThreadSafeCache.getInstance("Beta");
            System.out.println(cache.id);
		}		
	}
	
	@Test
	void testThreadSafeCache() throws InterruptedException{		
		
        System.out.println("Testing Thread-Safe cache:");
        System.out.println("You see the same value always hence singleton was reused" + "\n" +
                "RESULT:" + "\n");
		
		Thread t1 = new Thread(new Thread3());
		Thread t2 = new Thread(new Thread4());		

		// this code always produces consistent results
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
	}
	
	class Thread3 implements Runnable
	{
		@Override
		public void run() {
			var cache  = ThreadSafeCache.getInstance("Alpha");
            System.out.println(cache.id);
		}		
	}
	
	class Thread4 implements Runnable
	{
		@Override
		public void run() {
			var cache  = ThreadSafeCache.getInstance("Beta");
            System.out.println(cache.id);
		}		
	}
}
