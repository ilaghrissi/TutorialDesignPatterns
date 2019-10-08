package com.tutorial.training.factoryMethod;

public class Square implements Shape{

	@Override
	public Shape draw() {
		System.out.println("Draw Square");
		return this;
	}

}
