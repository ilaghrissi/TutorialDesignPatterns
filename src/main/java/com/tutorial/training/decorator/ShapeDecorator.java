package com.tutorial.training.decorator;

public abstract class ShapeDecorator implements Shape{

	protected Shape shapeDecorator;
	
	public ShapeDecorator(Shape shapeDecorator) {
		this.shapeDecorator = shapeDecorator;
	}

	public String draw() {
		return shapeDecorator.draw();
	}

}
