##Builder

Builder design pattern allows us to separate the construction of a complex object from its representation,which allows the same construction to have different representation. It is a good choice when the class, that is supposed to instantiated, expects more than a handful of parameters. One solution, in that scenario, is to multiple constructors with different combinations of parameters, for instance


```
Pizza(int size) { ... }        
Pizza(int size, boolean cheese) { ... }    
Pizza(int size, boolean cheese, boolean pepperoni) { ... }    
Pizza(int size, boolean cheese, boolean pepperoni, boolean bacon) { ... }
```

This kind of design is referred to as Telescoping constructor pattern. Managing and using this kind of code is difficult and is not preferrable. Alternative to this kind of code is Builder pattern like the code below 

```
public class Pizza {
	enum size {
		SMALL, MEDIUM, LARGE
	};

	private size size;
	private boolean cheese;
	private boolean veggies;
	private boolean pepporoni;

	public static class Builder {
		private final size size;

		private boolean cheese = false;
		private boolean veggies = false;
		private boolean pepporoni = false;

		public Builder(size size) {
			this.size = size;
		}																																																																						       	public Builder cheese(boolean value) {
			cheese = value;
			return Builder.this;
		}

		public Builder pepperoni(boolean value) {
			pepporoni = value;
			return Builder.this;
		}

		public Builder veggies(boolean value) {
			veggies = value;
			return Builder.this;
		}

		public Pizza build() {
			return new Pizza(Builder.this);
		}
	}

	private Pizza(Builder builder) {
		this.size = builder.size;
		this.cheese = builder.cheese;
		this.pepporoni = builder.pepporoni;
		this.veggies = builder.veggies;
	}
}

##To instatiate the class, we can specify the parameter as below
Pizza p = new Pizza.Builder(size.MEDIUM).cheese(true).pepperoni(true).build();

```
This pattern is flexible and it is easy to add manipulate parameter list in the future. Here we replace the multiple constructors with a series of parameters like the code in the following block `new Pizza.Builder(size.MEDIUM).cheese(true).pepperoni(true).build()`.

One anology of builder pattern is building a meal at a fast food restraunt.  It typically consist of some combination main item, a side item, a drink, a dessert etc. The customer specifies the list of items he wants in the meal, that is analogous to the code  
`new Pizza.Builder(size.MEDIUM).cheese(true).pepperoni(true).build();` above.

![](https://github.com/joed7/Creational-design-patterns/blob/master/images/builder.png)


__Source Code__

Refer to the [link](https://github.com/joed7/Creational-design-patterns/tree/master/src/com/pattern/builder) for the source-code for builder design pattern.

[Previous](https://github.com/joed7/Creational-design-patterns/blob/master/pooling.md)  |  [Home](https://github.com/joed7/Creational-design-patterns/blob/master/home.md)  |  [Next](https://github.com/joed7/Creational-design-patterns/blob/master/prototype.md)
