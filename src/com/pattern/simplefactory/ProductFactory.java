package com.pattern.simplefactory;

public class ProductFactory {

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
}
