package com.pattern.prototype;

public class Triangle extends Shape {

	public Triangle() {
		type = "Rectangle";
	}

	@Override
	public void draw() {
		System.out.println("draw a rectangle");
	}
}

