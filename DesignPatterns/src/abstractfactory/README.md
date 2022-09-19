Problem: 
    Imagine having a set of geometrical shapes where each shape comes in various forms/sizes (a family of related shapes).
    We need a way to ensure only shapes of the same family are created.
    We don't want a client that expects a shape of type X to recieve a shape of type Y.
    Also we don't want to modify client code each time a new shape or a variant of it is add or removed.
    
Solution:
	The first thing the Abstract Factory pattern suggests is to explicitly declare an interface that represents a Shape.
	The next step is to declare a base class implementing Shape for each group of related shapes i.e. Triangle, Circle, etc.. and
	for each variant for a given Shape category create a concrete class extending the base class e.g. EquilateralTriangle.
	Then declare an interface ShapeFactory (the abstract factory) with a common creation method for Shape.
	Now we create a separate factory class based on the ShapeFactory interface for each group of related shapes,
	it returns a Shape object of particular category such as EquilateralTriangle, RightTriangle and so on.
	The client code has to work with both factories and shapes via their respective abstract interfaces.
	This lets us change the type of a factory that we pass to the client code, as well as the shape variant
	that the client code receives, without breaking the actual client code.