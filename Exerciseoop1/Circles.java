package Exerciseoop1;

public class Circles extends Shapes {
	private double radius;
	
	public Circles(double radius) {
		super("Circle");
		this.radius=radius;
	}

	
	public void draw() {
		System.out.println("Drawing a circle...");
		
		
	}

	@Override
	public double getarea() {
		
		return Math.PI*radius*radius;
	}
	

}
