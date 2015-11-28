##Abstract Factory

Abstract Factory provides an interface for creating families of related products; By writing code to the interface, we decouple our code from the actual factory that creates the products. Since our client code is decoupled from the acutal products, we can subsitute different factories to get different beahviors. This allows us to implement a family of factories of similar theme but meant for diffent parameters like regions, demographics. operating systems etc.

The UML diagram for this design pattern looks like this:

![](https://github.com/joed7/Creational-design-patterns/blob/master/images/Abstract_Factory_design_pattern.png)

Our implmentation for this design pattern consists of the following components:

* [Pizza Ingredient Factory](https://github.com/joed7/Creational-design-patterns/blob/master/src/com/pattern/abstractfactory/PizzaIngredientFactory.java): This is the class that provides an interface for a family of products.

* [Chicago Pizza Ingredient Factory](https://github.com/joed7/Creational-design-patterns/blob/master/src/com/pattern/abstractfactory/ChicagoPizzaIngredientFactory.java), [NY Pizza Ingredient Factory](https://github.com/joed7/Creational-design-patterns/blob/master/src/com/pattern/abstractfactory/NYPizzaIngredientFactory.java): These provide the concrete implementation for the abstract factory.

* [NY Pizza Store](https://github.com/joed7/Creational-design-patterns/blob/master/src/com/pattern/abstractfactory/NYPizzaStore.java), [Chicago Pizza Store](https://github.com/joed7/Creational-design-patterns/blob/master/src/com/pattern/abstractfactory/ChicagoPizzaStore.java): Clients of the Abstract Factory. They are decoupled from any of the specifics of the concrete products.  

* [Clam](https://github.com/joed7/Creational-design-patterns/blob/master/src/com/pattern/abstractfactory/Clam.java), [Dough](https://github.com/joed7/Creational-design-patterns/blob/master/src/com/pattern/abstractfactory/Dough.java), [Veggies](https://github.com/joed7/Creational-design-patterns/blob/master/src/com/pattern/abstractfactory/Veggies.java), [Sauce](https://github.com/joed7/Creational-design-patterns/blob/master/src/com/pattern/abstractfactory/Sauce.java), [Cheese](https://github.com/joed7/Creational-design-patterns/blob/master/src/com/pattern/abstractfactory/Cheese.java): Interfaces, the concrete products implement. 

