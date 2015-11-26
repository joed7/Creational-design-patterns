package com.pattern.simplefactory;

public class ModifiedProductFactory {

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

}
