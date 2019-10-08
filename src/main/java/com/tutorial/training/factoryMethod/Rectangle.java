package com.tutorial.training.factoryMethod;

public class Rectangle implements Shape {

	@Override
	public Shape draw() {
		System.out.println("Draw Rectangle");
		return this;
	}

}
