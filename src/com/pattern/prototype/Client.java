package com.pattern.prototype;

import com.pattern.prototype.ShapeRegistry.ModelType;

public class Client {

	public static void main(String[] args) throws CloneNotSupportedException {
		 Shape rectangle = ShapeRegistry.getInstance(ModelType.RECTANGLE);
		 Shape square = ShapeRegistry.getInstance(ModelType.SQUARE);
	}
}
