package com.pattern.prototype;

public class ShapeRegistry {
	
	public static class ModelType {
		public static final String TRIANGLE = "triangle";
		public static final String SQUARE = "square";
		public static final String RECTANGLE = "rectangle";
	}

	private static java.util.Map<String, Shape> prototypes = new java.util.HashMap<String, Shape>();

	static {
		prototypes.put(ModelType.TRIANGLE, new Circle());
		prototypes.put(ModelType.SQUARE, new Square());
		prototypes.put(ModelType.RECTANGLE, new Rectangle());
	}

	public static Shape getInstance(final String s)
			throws CloneNotSupportedException {
		return prototypes.get(s);
	}
}