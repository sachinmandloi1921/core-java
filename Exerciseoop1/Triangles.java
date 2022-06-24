package Exerciseoop1;

public class Triangles extends Shapes {
	private double base;
	private double height;
	
	public Triangles(double base, double height) {
		super("Triangles");
		this.base=base;
		this.height=height;
	}

	
	@Override
	public void draw() {
	System.out.println("drawing a triangle...");
		
	}

	@Override
	public double getarea() {
		
		return base*height*1/2;
	}

}
