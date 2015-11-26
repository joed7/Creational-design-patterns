package com.pattern.prototype;

public class Show implements PrototypeCapable {
	private String name = null;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public Show clone() throws CloneNotSupportedException {
		return (Show) super.clone();
	}

	@Override
	public String toString() {
		return "Show";
	}

}
