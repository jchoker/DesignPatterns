Problem:
	We want to create an exact copy of an object.
	First, We create a new object of the same class.
	Then we go through the fields of the original object and copy their values over to the new object.
	However, some of the object’s fields may be private and not visible from outside of the object itself.
	In addition, we have to know the object’s class, so our code becomes dependent on that class.
	Moreover, sometimes we only know the interface the object follows, but not its concrete class when,
	for example, a parameter in a method accepts any objects that implement some interface.
    
Solution:
	The Prototype pattern delegates the cloning process to the actual objects that are being cloned. 
	This is typically done through a method called clone which returns an exact copy of the object itself.
	The implementation of the clone method is very similar in all classes. The method creates an object of the current
	class and carries over all of the field values of the old object into the new one.
	We can copy private fields because most languages let objects access private fields of other objects that belong to the same class.
	An object that supports cloning is called a prototype.