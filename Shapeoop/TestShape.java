package Shapeoop;

public class TestShape {
	public static void main(String[] args) {
		Shape s = new Shape();
		s.setColor("orange");
		s.setBorderWidth(10);
		String ms = s.getcolor();
		int ns = s.getBorderWidth();
		System.out.println(ms);
		System.out.println(ns);
		
		
	}

}
