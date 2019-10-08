package com.tutorial.training.singleton;

public class SingleObject {

	private static final SingleObject instance = new SingleObject();
	
	private SingleObject() {
		System.out.println("Create instance");
	}
	
	public static SingleObject getInstance() {
		return instance;
	}
	
	public void showMessage() {
		System.out.println("Hello world!");
	}

	
}
