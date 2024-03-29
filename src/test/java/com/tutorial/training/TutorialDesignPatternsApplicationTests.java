package com.tutorial.training;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.tutorial.training.decorator.RedShapeDecorator;
import com.tutorial.training.factoryMethod.Circle;
import com.tutorial.training.factoryMethod.Rectangle;
import com.tutorial.training.factoryMethod.Shape;
import com.tutorial.training.factoryMethod.ShapeFactory;
import com.tutorial.training.factoryMethod.ShapeType;
import com.tutorial.training.factoryMethod.Square;
import com.tutorial.training.singleton.SingleObject;

public class TutorialDesignPatternsApplicationTests {

	@Test
	public void singletonTest() {
		SingleObject s1 = SingleObject.getInstance();
		SingleObject s2 = SingleObject.getInstance();
		s1.showMessage();

		assertEquals(s1, s2);
	}

	@Test
	public void factoryMethodTest() {
		ShapeFactory shapeFactory = new ShapeFactory();
		Shape circle = shapeFactory.getShape(ShapeType.CIRCLE);
		Shape c = circle.draw();

		Shape square = shapeFactory.getShape(ShapeType.SQUARE);
		Shape s = square.draw();

		Shape rectangle = shapeFactory.getShape(ShapeType.RECTANGLE);
		Shape r = rectangle.draw();

		assertTrue(c instanceof Circle);
		assertTrue(s instanceof Square);
		assertTrue(r instanceof Rectangle);
	}
	
	@Test
	public void decoratorTest() {
		com.tutorial.training.decorator.Shape circle = new com.tutorial.training.decorator.Circle();
		com.tutorial.training.decorator.Shape redCircle = new RedShapeDecorator(new com.tutorial.training.decorator.Circle());
		
		String actual1 = circle.draw();
		assertEquals("Draw Circle", actual1);
		System.out.println("");
		String actual2 = redCircle.draw();
		assertEquals("Draw Circle with border color : red", actual2);
		
	}

}
