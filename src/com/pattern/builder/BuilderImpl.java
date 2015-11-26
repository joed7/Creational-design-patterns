package com.pattern.builder;

import com.pattern.builder.Pizza.size;

public class BuilderImpl {

	public static void main(String[] args) {
		Pizza p = new Pizza.Builder(size.MEDIUM).cheese(true).pepperoni(true).build();
	}
}
