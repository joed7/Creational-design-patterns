##Singleton

Singleton design pattern allows instantiation of a class to one object. It is useful in the scenarios where one object is needed to coordinate actions across the system.

For the singleton class, the constructor is made private so direct instantiation is not possible. We make the class instance a static instance member and acess it via a static `getInstance` method. To handle the multithreading scenario, we add the synchronization block. 


```
public class Singleton {

	private static Singleton instance = null;

	private Singleton() {

	}

	public static Singleton getInstance() {
		if (instance == null) {
			synchronized (Singleton.class) {
				if (instance == null) {
					instance = new Singleton();
				}
			}
		}
		return instance;
	}
}

```  

The above code defines the class Singleton in the form of singleton design pattern. There are many variation of singleton design pattern, the one above initializes the instance in a lazy manner(when the instance is requested by the client), some variations initialize the initialize on class loading like this `Singleton instance = new Singleton()` instead. 

__UML Diagram__

The uml diagram for Singleton design pattern looks like this

![](https://github.com/joed7/Creational-design-patterns/blob/master/images/singleton.png)

__Source Code__

Please refer to the [link](https://github.com/joed7/Creational-design-patterns/blob/master/src/com/pattern/singleton/Singleton.java) for Singelton source code.

[Previous](https://github.com/joed7/Creational-design-patterns/blob/master/introduction.md)  |  [Home](https://github.com/joed7/Creational-design-patterns/blob/master/home.md)  |  [Next](https://github.com/joed7/Creational-design-patterns/blob/master/simplefactory.md)
