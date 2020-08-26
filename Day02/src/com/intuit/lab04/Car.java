package com.intuit.lab04;

public class Car {
	private String model;
	private String color;
	
	private Engine engine;
	
	public Car(String theModel, String theColor) {
		model = theModel;
		color = theColor;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	
}
