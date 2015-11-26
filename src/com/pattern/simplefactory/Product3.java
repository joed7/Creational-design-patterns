package com.pattern.simplefactory;

public class Product3 implements Product {

	@Override
	public void manufacture() {
		System.out.println("Manufacturing product3");
	}

	@Override
	public void packageProduct() {
		System.out.println("Packaging product3");
	}

	@Override
	public void label() {
		System.out.println("Shipping product3");
	}

}
