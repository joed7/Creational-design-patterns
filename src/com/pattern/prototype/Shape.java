package com.pattern.prototype;

public abstract class Shape implements Prototypable {

	private String id;
	protected String type;

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	abstract void draw();

}
