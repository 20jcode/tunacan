package org.c3;

public abstract class Beverage {
	String description = "noname";

	public String getDescription(){
		return description;
	}

	public abstract double cost();
}
