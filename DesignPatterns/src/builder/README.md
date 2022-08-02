Problem: Imagine a complex object that requires laborious, step-by-step initialization of many fields and nested objects.
		 Such initialization code is usually buried inside a monstrous constructor with lots of parameters.
		 Or even worse: scattered all over the client code.
		 Another approach is to extend the base class and create a set of subclasses to cover all combinations of the parameters.
		 But eventually we end up with a considerable number of subclasses. Any new parameter will require growing this hierarchy even more.

Solution: The Builder pattern suggests that you extract the object construction code out of its own class and move it to separate objects called builders.