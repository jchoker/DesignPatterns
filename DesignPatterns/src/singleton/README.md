Problem: 2 problems violating the Single Responsibility Principle, ensure that a class has just a single instance and provide a global access point to that instance.

Solution: All implementations of the Singleton have two steps in common,
    	  1-The default constructor is private, to prevent other objects from using the new operator with the Singleton class.
    	  2-A static creation method that acts as a constructor. Under the hood, this method calls the private constructor to create an object and saves it in a static field.
    	    All following calls to this method return the cached object.
