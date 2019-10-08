package com.tutorial.training.decorator;

public class RedShapeDecorator extends ShapeDecorator{

	public RedShapeDecorator(Shape shapeDecorator) {
		super(shapeDecorator);
	}
	
	@Override
	public String draw() {
		String r = shapeDecorator.draw();
		String res = setRedBorder(shapeDecorator);
		StringBuilder sb = new StringBuilder();
		sb.append(r);
		sb.append(res);
		return sb.toString();
	}
	private String setRedBorder(Shape shapeDecorator) {
		return " with border color : red";
	}

}
