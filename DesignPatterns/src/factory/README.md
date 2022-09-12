Problem: 
    We have a Canvas in which different shapes can be drawn.
    The types of shapes to be drawn are specified during runtime.
    The logic to draw shapes is embedded inside the Canvas class.
    Overtime new shapes are required and Canvas has to be modified to adjust for new requirements.
Solution:
	The factory pattern suggests pulling out the logic of creating concrete implementations of Shape into a new factory class (ShapeFactory). 
	This class provides an API called factory method to create different types of Shape based on a given input parameter.
	Modify Canvas to contain an instance of ShapeFactory and delegate the responsibility of creating the desired shape to the factory.
	Any time a new shape is to be added, we'd need to modify ShapeFactory only to support the new shape and therefore Canvas remains intact.
	Alternatively, make ShapeFactory abstract and have for example TriangleShapeFactory, RectangleShapeFactory etc.. for drawing different sets of shapes.