package com.pattern.abstractfactory;

public abstract class Pizza {
	String name;
	protected Dough dough;
	protected Sauce sauce;

	public abstract void prepare();

	public void bake() {
	}

	public void cut() {
	}

	public void box() {
	}
}
