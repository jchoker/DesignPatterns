Problem: Client code must work with a broad set of objects that belong to a sophisticated library or framework.
 		 We need to initialize all of those objects, keep track of dependencies, execute methods in the correct order, and so on.
 		 The business logic would become tightly coupled to the implementation details of 3rd-party classes.

Solution: A facade class that provides a simple interface to a complex subsystem which contains lots of moving parts.
 		  It might provide limited functionality in comparison to working with the subsystem directly.
 		  However, it includes only those features that clients really care about.