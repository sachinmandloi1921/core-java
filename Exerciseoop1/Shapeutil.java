package Exerciseoop1;

public class Shapeutil {
	public static void printShapeDetails(Shapes[]list) {
		for (int i = 0; i <list.length; i++) {
			String name = list[i].getName();
			double area = list[i].getarea();
			System.out.println("Name: " + name);
			System.out.println("Area: " + area);
			
		}
		
		
	}

}
