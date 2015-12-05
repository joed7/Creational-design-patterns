##Prototype

Prototype design pattern is used in the scenarios when creating an instance of a class in either expensive or complicated. In Prototype design pattern, we create the instance of actual object (i.e. prototype) at the beginning,  and whenever a new instance is required, we clone this instance using `clone()` method in Java. 

This design pattern consists of three components: Prototype, Protoype registry, Client.

* Prototype : Prototype is the class that is supposed to be cloned.

* Prototype registry : Registry maintains a list of prototypes accessible using string parameters.

* Client : Client makes use of the registry service to access prototype instances.

UML diagram for the implementation looks like this
![](https://github.com/joed7/Creational-design-patterns/blob/master/images/prototype_pattern_uml_diagram.jpg)

In our implementation, [Circle](https://github.com/joed7/Creational-design-patterns/blob/master/src/com/pattern/prototype/Circle.java), [Square](https://github.com/joed7/Creational-design-patterns/blob/master/src/com/pattern/prototype/Square.java), [Rectangle](https://github.com/joed7/Creational-design-patterns/blob/master/src/com/pattern/prototype/Rectangle.java) are Prototypes; [Shape Registry](https://github.com/joed7/Creational-design-patterns/blob/master/src/com/pattern/prototype/ShapeRegistry.java) is the Prototype Registry. 

In the registry class, we manintain a map which stores  instances correponding to tags. The client requests an instance for a particular tag, We fetch the instance from the map, call the clone method for that instance and return the cloned instance.

```
public class ShapeRegistry {
	
	public static class ModelType {
		public static final String CIRCLE = "circle";
		public static final String SQUARE = "square";
		public static final String RECTANGLE = "rectangle";n
	}

	private static java.util.Map<String, Shape> prototypes = new java.util.HashMap<String, Shape>();

	static {
		prototypes.put(ModelType.CIRCLE, new Circle());
		prototypes.put(ModelType.SQUARE, new Square());
		prototypes.put(ModelType.RECTANGLE, new Rectangle());
	}

	public static Shape getInstance(final String s)
			throws CloneNotSupportedException {
		return (Shape) (prototypes.get(s).clone());
	}
}
```

If in future, we want to add another shape, we can extend the shape and add an entry in the Shape Registry corresponding to that shape. Another benefit of the Prototype design pattern is that client can generate object without knowing the type beforehand.

In our implementation, we perform the shallow copy of the instance, If we want to perform deep copy instead, the `clone()` call needs to replaced with appropriate functionality. 

__Source Code__

The source code for Prototype design pattern can be found [here](https://github.com/joed7/Creational-design-patterns/tree/master/src/com/pattern/prototype)

[Previous](https://github.com/joed7/Creational-design-patterns/blob/master/builder.md)  |  [Home](https://github.com/joed7/Creational-design-patterns/blob/master/home.md)  |  [Next](https://github.com/joed7/Creational-design-patterns/blob/master/source-code.md)
