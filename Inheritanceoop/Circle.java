package Inheritanceoop;

import java.lang.ProcessBuilder.Redirect;

public class Circle extends Shape {
	private static final double pi = 3.14;
	private double radius;
	 public Circle(int i) {
	radius=i;
	}

	public Double area() {
		return pi * radius * radius;
		 
		
		  }

	public double getRadius() {
		return radius;
	}

	public void setRadius(double d) {
		this.radius = d;
	}
	public Double area(Double d) {
		return null;
		
	}

}
