##SimpleFactory

Simple factory allows us to create objects without exposing the object creation logic to the client. Client specifies a number or a string or a enum type to the factory, and it returns an instance on the basis of that. It allows use to separate code of object instantiation from the code that makes use of the created objects. For e.g. The [ProductFactory](https://github.com/joed7/Creational-design-patterns/blob/master/src/com/pattern/simplefactory/ProductFactory.java) class violates open(for extension)/closed(for modification) principle, since if we want to add/remove products, the class has to be modified; The class is tightly coupled with concrete types of the products(poduct1, product2).

```
	public Product produceProduct(String name) {
		Product p = null;

		if (name == "product1") {
			p = new Product1();
		} else if (name == "product2") {
			p = new Product2();
		}
		
		p.manufacture();
		p.packageProduct();
		p.label();

		return p;

	}
```	  

Instead, we move to object creation code to a [factory](https://github.com/joed7/Creational-design-patterns/blob/master/src/com/pattern/simplefactory/SimpleProductFactory.java), which expects a parameter and returns a type instance on the basis of that.

```
	public Product produceProduct(String name) {
		Product p = null;

		if (name == "product1") {
			p = new Product1();
		} else if (name == "product2") {
			p = new Product2();
		}

		return p;

	}
```	

and change the client to include the instance of simple factory like [ModifiedProductFactory](https://github.com/joed7/Creational-design-patterns/blob/master/src/com/pattern/simplefactory/ModifiedProductFactory.java)

```
	public SimpleProductFactory productFactory;

	public ModifiedProductFactory(SimpleProductFactory productFactory) {
		super();
		this.productFactory = productFactory;
	}

	public Product produceProduct(String name) {
		Product p = null;

		p = productFactory.produceProduct(name);
		p.manufacture();
		p.packageProduct();
		p.label();

		return p;

	}
```

This class is now closed for modification, as nothing needs to be modified to accommodate new products; The class is now loosely coupled. 	

__Source Code__

The source code for this design pattern can be found [here](https://github.com/joed7/Creational-design-patterns/tree/master/src/com/pattern/simplefactory).

[Previous](https://github.com/joed7/Creational-design-patterns/blob/master/singleton.md)  |  [Home](https://github.com/joed7/Creational-design-patterns/blob/master/home.md)  |  [Next](https://github.com/joed7/Creational-design-patterns/blob/master/factorymethod.md)
