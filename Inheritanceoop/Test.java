package Inheritanceoop;

public class Test {
	public static void main(String[] args) {
		Shape [] s= new  Shape[3];
 s[0] = new Circle(6);
 s[1] = new Rectangle(3,4);
 s[2] = new Triangle(2,3);
 for (Shape sh : s) {
 System.out.println(sh.area());

 }
	}
}
