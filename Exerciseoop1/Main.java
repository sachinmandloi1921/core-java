package Exerciseoop1;

public class Main {
	public static void main(String[] args) {
		Shapes[]shapelist= new Shapes[3];
		shapelist[0]= new Rectangles(10,20);
		shapelist[1]= new Circles(4);
		shapelist[2]= new Triangles(10,20);
		
		Shapeutil.printShapeDetails(shapelist);
		
		
		
		
	}

}
