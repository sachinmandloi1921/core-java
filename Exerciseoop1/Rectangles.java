package Exerciseoop1;

public class Rectangles extends Shapes {
	private double width;
	private double height;
	
	public Rectangles(double width, double height) {
		super("Rectangle");
		this.width=width;
		this.height=height;
	}

	@Override
	public void draw() {
		System.out.println("Drawing a rectangle...");
		
	}

	@Override
	public double getarea() {
		return width*height;
	}

}
