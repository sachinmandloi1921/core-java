package Inheritanceoop;

import in.co.rays.basics.stringcllas;

public class Triangle extends Shape{
	private int base;
	private int height;
	public Triangle(int i, int j) {
		base=i;
		height=j;
		// TODO Auto-generated constructor stub
	}
	public int getBase() {
		return base;
	}
	public Double area() {
		return (double) (base* height * 1/2);
		
	}
	
	public void setBase(int base) {
		this.base = base;
	}
	public int getHieght() {
		return height;
	}
	public void setHieght(int height) {
		this.height = height;
	}
	

}
