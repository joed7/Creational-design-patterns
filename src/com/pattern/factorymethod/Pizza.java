package com.pattern.factorymethod;

public abstract class Pizza {
	
	String name;
	
	public Pizza(String name) {
		this.name = name;
	}
	
	public void packing(){
		
	}
	public void delivery(){
		
	}
	
	abstract void bake();
}
