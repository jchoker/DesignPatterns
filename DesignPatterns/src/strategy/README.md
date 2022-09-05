Problem: 
    We have two different behaviors (methods): (a) Sorting a list of objects, (b) Displaying a list of objects.
    Sort behavior can be implemented using different algorithms with different run-time complexities.
    Display behavior can be implemented showing a list either in natural order or in reverse order.
    We have an "Author" class that should have both Sort behavior and Display behavior.
    An Author object should be able to implement these two behaviors with different implementations.


Solution: 
    Pull out the two behaviors from the Author class and put them in two hierarchies of behaviors (i.e. interfaces and concrete implementations).
    Create two methods inside the Author class that identify the concrete implementation of the two behaviors and return the reference to the behaviors as objects.
    Use the identified objects inside the Author class to call the concrete implementation of the expected behaviors.
    
NB: Most modern languages (Java,C#,..) bring support of lambda functions, which can serve as simpler alternatives to the Strategy pattern.    
