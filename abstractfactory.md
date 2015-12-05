##Abstract Factory

Abstract Factory provides an interface for creating families of related products; By writing code to the interface, we decouple our code from the actual factory that creates the products. Since our client code is decoupled from the acutal products, we can subsitute different factories to get different beahviors. This allows us to implement a family of factories of similar theme but meant for diffent parameters like regions, demographics. operating systems etc.

The UML diagram for this design pattern looks like this:

![](https://github.com/joed7/Creational-design-patterns/blob/master/images/Abstract_Factory_design_pattern.png)

Our implmentation for this design pattern consists of the following components:

* [Pizza Ingredient Factory](https://github.com/joed7/Creational-design-patterns/blob/master/src/com/pattern/abstractfactory/PizzaIngredientFactory.java): This is the class that provides an interface for a family of products. In this example, the products whose families we make are Dough, Sauce, cheese etc.

```
public interface PizzaIngredientFactory {

	public Dough createDough();

	public Sauce createSauce();

	public Cheese createCheese();

	public Veggies createVeggies();

	public Pepproni createPepporoni();

	public Clam createClam();

}
```

* [Chicago Pizza Ingredient Factory](https://github.com/joed7/Creational-design-patterns/blob/master/src/com/pattern/abstractfactory/ChicagoPizzaIngredientFactory.java), [NY Pizza Ingredient Factory](https://github.com/joed7/Creational-design-patterns/blob/master/src/com/pattern/abstractfactory/NYPizzaIngredientFactory.java): These provide the concrete implementation for the abstract factory.

The ingredient factory below returns Chicago based products.
```
public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {


	@Override
	public Dough createDough() {
		return new ChicagoDough();
	}

	@Override
	public Sauce createSauce() {
		return new ChicagoSauce();
	}

	@Override
	public Cheese createCheese() {
		return new ChicagoCheese();
	}

	@Override
	public Veggies createVeggies() {
		return new ChicagoVeggies();
	}

	@Override
	public Pepproni createPepporoni() {
		return new ChicagoPepporoni();
	}

	@Override
	public Clam createClam() {
		return new ChicagoClam();
	}

}
```

* [Clam](https://github.com/joed7/Creational-design-patterns/blob/master/src/com/pattern/abstractfactory/Clam.java), [Dough](https://github.com/joed7/Creational-design-patterns/blob/master/src/com/pattern/abstractfactory/Dough.java), [Veggies](https://github.com/joed7/Creational-design-patterns/blob/master/src/com/pattern/abstractfactory/Veggies.java), [Sauce](https://github.com/joed7/Creational-design-patterns/blob/master/src/com/pattern/abstractfactory/Sauce.java), [Cheese](https://github.com/joed7/Creational-design-patterns/blob/master/src/com/pattern/abstractfactory/Cheese.java): Interfaces which the concrete products implement. 

* [ChicagoClam](https://github.com/joed7/Creational-design-patterns/blob/master/src/com/pattern/abstractfactory/ChicagoClam.java), [ChicagoDough](https://github.com/joed7/Creational-design-patterns/blob/master/src/com/pattern/abstractfactory/ChicagoDough.java), [ChicagoVeggies](https://github.com/joed7/Creational-design-patterns/blob/master/src/com/pattern/abstractfactory/ChicagoVeggies.java), [ChicagoSauce](https://github.com/joed7/Creational-design-patterns/blob/master/src/com/pattern/abstractfactory/ChicagoSauce.java), [ChicagoCheese](https://github.com/joed7/Creational-design-patterns/blob/master/src/com/pattern/abstractfactory/ChicagoCheese.java), [NYClam](https://github.com/joed7/Creational-design-patterns/blob/master/src/com/pattern/abstractfactory/NYClam.java), [NYDough](https://github.com/joed7/Creational-design-patterns/blob/master/src/com/pattern/abstractfactory/NYDough.java), [NYVeggies](https://github.com/joed7/Creational-design-patterns/blob/master/src/com/pattern/abstractfactory/NYVeggies.java), [NYSauce](https://github.com/joed7/Creational-design-patterns/blob/master/src/com/pattern/abstractfactory/NYSauce.java), [NYCheese](https://github.com/joed7/Creational-design-patterns/blob/master/src/com/pattern/abstractfactory/NYCheese.java): Family of Products being made.


* [NY Pizza Store](https://github.com/joed7/Creational-design-patterns/blob/master/src/com/pattern/abstractfactory/NYPizzaStore.java), [Chicago Pizza Store](https://github.com/joed7/Creational-design-patterns/blob/master/src/com/pattern/abstractfactory/ChicagoPizzaStore.java): Clients of the Abstract Factory. 

* [Cheese Pizza](https://github.com/joed7/Creational-design-patterns/blob/master/src/com/pattern/abstractfactory/CheesePizza.java), [Pepporoni Pizza](https://github.com/joed7/Creational-design-patterns/blob/master/src/com/pattern/abstractfactory/PepporoniPizza.java): It holds an instance to the Abstract Ingredient factory. They are decoupled from any of the specifics of the concrete products. So, on runtime we can specify different concrete factory instaces, and depedending upon the instance of the factory provided(Chicago, NY), it either creates NY or Chicago products.

```
public class CheesePizza extends Pizza {

	PizzaIngredientFactory factory;
	private Cheese cheese;

	public CheesePizza(PizzaIngredientFactory factory) {
		super();
		this.factory = factory;
	}

	@Override
	public void prepare() {
		dough = factory.createDough();
		sauce = factory.createSauce();
		cheese = factory.createCheese();
	}

}

```

__Source Code__

The source code for this design pattern can be found [here](https://github.com/joed7/Creational-design-patterns/tree/master/src/com/pattern/abstractfactory).

 
[Previous](https://github.com/joed7/Creational-design-patterns/blob/master/factorymethod.md)  |  [Home](https://github.com/joed7/Creational-design-patterns/blob/master/home.md)  |  [Next](https://github.com/joed7/Creational-design-patterns/blob/master/pooling.md)
