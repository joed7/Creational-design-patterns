##Factory Method

The factory method design pattern defines an interface for creating instances but lets the subclasses decide which classes to instantiate i.e. it defers the class instantiation to the subclasses. The pattern consists of a superclass which specifies all the standard behavior and then delegates the creation details to subclasses.

The UML diagram for this design pattern looks like this:

![](https://github.com/joed7/Creational-design-patterns/blob/master/images/factory_method.gif)

The pattern consists of the following components: Creator, ConcreteCreator, Product, ConcreteProduct.

* Creator: The creator class is the abstract class that contains the abstract factory method, whose implementaion is provided by the subclasses, along with the implementations for all of the methods to manipulate products. The creator class is written without knowledge of the actual products that will be created. It is loosely coupled with ConcreteProducts.

* ConcreteCreator: This class implements the factoryMethod which actually produces the products. It is responsible for creating one or more concrete products; It is only class with knowledge of how to create ConcreteProducts. 

* Product: Product is the interface all the concrete products implement.

* ConcreteProduct: They are the actually products being created.


In our implmentation of Factory Method, [__AbstractPizzaStore__](https://github.com/joed7/Creational-design-patterns/blob/master/src/com/pattern/factorymethod/AbstractPizzaStore.java) is the Creator class, [__ModifiedChicagoPizzaStore__](https://github.com/joed7/Creational-design-patterns/blob/master/src/com/pattern/factorymethod/ModifiedChicagoPizzaStore.java), [__ModifiedNYPizzaStore__](https://github.com/joed7/Creational-design-patterns/blob/master/src/com/pattern/factorymethod/ModifiedNYPizzaStore.java) are the ConcreteCreator clasess, [__Pizza__](https://github.com/joed7/Creational-design-patterns/blob/master/src/com/pattern/factorymethod/Pizza.java) is an abstract class which is implemented by all of the concrete pizza classes, and [__ChicagoPizza1__](https://github.com/joed7/Creational-design-patterns/blob/master/src/com/pattern/factorymethod/ChicagoPizza1.java),  [__ChicagoPizza2__](https://github.com/joed7/Creational-design-patterns/blob/master/src/com/pattern/factorymethod/ChicagoPizza2.java), [__NYPizza1__](https://github.com/joed7/Creational-design-patterns/blob/master/src/com/pattern/factorymethod/NYPizza1.java), [__NYPizza2__](https://github.com/joed7/Creational-design-patterns/blob/master/src/com/pattern/factorymethod/NYPizza2.java) are the ConcreteProduct classes. 


AbstractPizzaStore standardizes the pizza creation process in the __OrderPizza__ method, which internally calls the factory method __CreatePizza__.

```
//AbstractPizzaStore.java

	protected abstract Pizza createPizza(String name);

	public Pizza orderPizza(String name) {
		Pizza p = null;

		p = createPizza(name);

		p.bake();
		p.packing();
		p.delivery();

		return p;

	}
```	

ModifiedNYPizzaStore provides the implmentation of the factory method

```
	@Override
	protected Pizza createPizza(String name) {
		Pizza p = null;

		if (name == "nypizza1") {
			p = new NYPizza1();
		} else if (name == "nypizza2") {
			p = new NYPizza2();
		}
		return p;

	}
```	
	
In our design, if in future, we want to expand our pizza franchisee, we just have to extend the AbstractPizzaStore and provide the implmentation of the factory method. 	