package com.pattern.simplefactory;

public class Product2 implements Product {

	@Override
	public void manufacture() {
		System.out.println("Manufacturing product2");
	}

	@Override
	public void packageProduct() {
		System.out.println("Packaging product2");
	}

	@Override
	public void label() {
		System.out.println("Shipping product2");
	}

}
