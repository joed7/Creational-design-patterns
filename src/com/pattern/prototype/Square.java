package com.pattern.prototype;

public class Square extends Shape {

	public Square() {
		type = "Rectangle";
	}

	@Override
	public void draw() {
		System.out.println("draw a rectangle");
	}
}

