package com.tutorial.training.factoryMethod;

public class Circle implements Shape{

	@Override
	public Shape draw() {
		System.out.println("Draw Circle");
		return this;
	}

}
