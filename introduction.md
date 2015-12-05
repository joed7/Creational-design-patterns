##Introduction

Creational design patterns deal with creation of objects, providing us a means to create objects in a manner suitable to the situation and requirement. The basic form of object creation could result in a rigid, tightly-coupled design which is complex and unscalable; Creational design patterns solve these problems by controlling this object creation.

Creational design patterns consists of two key ideas:

* First is encapsulating knowledge about which concrete classes the system uses. We achieve that by coding to interface, which allows loosely coupled design.

* Another is hiding the mechanism behind the creation of instances of the concrete classes. For e.g., the client of a singleton class does not really know how the only instance of the singleon class is created, the client just requests the class the instance and receives it. Likewise with Prototype design pattern. 

Creational design patterns provide different methods to remove instances to the concrete classes from the code that needs to instantiate them, thus providing independency between objects and classes.
Modern software engineering relies more on object composition than class inheritance, where we, instead of hard-coding behaviors in a class, define a smaller set of basic behaviors that can be composed into more complex ones. Hard-coding behaviors are inflexible and unscalable because one need to either override or re-implement the whole class to change or extend parts of the design. For these reasons, creational patterns are more useful than hard-coding behaviors.

 [Home](https://github.com/joed7/Creational-design-patterns/blob/master/home.md)  |  [Next](https://github.com/joed7/Creational-design-patterns/blob/master/singleton.md)
