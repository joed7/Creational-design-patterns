package com.pattern.simplefactory;

public class Product1 implements Product {

	@Override
	public void manufacture() {
		System.out.println("Manufacturing product1");
	}

	@Override
	public void packageProduct() {
		System.out.println("Packaging product1");
	}

	@Override
	public void label() {
		System.out.println("Shipping product1");
	}

}
