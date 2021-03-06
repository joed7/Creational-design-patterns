package com.pattern.prototype;

public abstract class Shape implements Cloneable {

	private String id;
	protected String type;

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	abstract void draw();

}
