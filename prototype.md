##Prototype

Prototype design pattern is used in the scenarios when creating an instance of a class in either expensive or complicated. In Prototype design pattern, we create the instance of actual object (i.e. prototype) at the beginning,  and whenever a new instance is required, we clone this instance using `clone()` method in Java. 

This design pattern consists of three components: Prototype, Protoype registry, Client.

* Prototype : Prototype is the class that is supposed to be cloned.

* Prototype registry : Registry maintains a list of prototypes accessible using string parameters.

* Client : Client makes use of the registry service to access prototype instances.

UML diagram for the implementation looks like this
![](https://github.com/joed7/Creational-design-patterns/blob/master/images/prototype_pattern_uml_diagram.jpg)

In our implementation, Circle, Square, Rectangle are Prototypes; Shape Registry is the Prototype Registry. If in future, we want to add another shape, we can extend the shape and add an entry in the Shape Registry corresponding to that shape. Another benefit of the Prototype design pattern is that client can generate object without knowing the type beforehand.

In our implementation, we perform the shallow copy of the instance, If we want to perform deep copy instead, the `clone()` call needs to replaced with appropriate functionality. 

__Source Code__

The source code for Prototype design pattern can be found [here](https://github.com/joed7/Creational-design-patterns/tree/master/src/com/pattern/prototype)