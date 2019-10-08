package com.tutorial.training;

import org.junit.Test;

import com.tutorial.training.singleton.SingleObject;

public class TutorialDesignPatternsApplicationTests {

	@Test
	public void singletonTest() {
		SingleObject s = SingleObject.getInstance();
		s.showMessage();
	}

}
