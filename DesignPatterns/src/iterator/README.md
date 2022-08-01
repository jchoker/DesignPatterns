Problem: Often we have a class the contains a collection of other objects.
    	 Clients of the class need to iterate over this collection of objects for different purposes such as changing or removing a specific item in the collection.
		 On the other hand, the client code that's supposed to work with various collections may not even care how they store their elements.
		 However, since collections all provide different ways of accessing their elements, we have no option other than to couple our code to the
		 specific collection classes hence hindering encapsulation.

Solution: The Iterator is a behavioural design pattern that lets you traverse elements of a collection contained within a given type without exposing its underlying representation (list, stack, tree, etc.).
		  By having your class implement Iterable<T> interface in Java, you'll be able to traverse the contained elements using a simple for-each loop.