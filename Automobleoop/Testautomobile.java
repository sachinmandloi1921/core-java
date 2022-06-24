package Automobleoop;

public class Testautomobile {
   public static void main(String[] args) {
	   Automobile ab = new Automobile();
	   ab.setColor("Black");
	   ab.setSpeed(120);
	   ab.setMake("Mahindra Scorpio S11");
	   ab.breck(60);
	   ab.changeGear(3);
	   ab.accelerator(30);
	   
	   System.out.println(ab.getColor());
	   System.out.println(ab.getSpeed());
	   System.out.println(ab.getMake());
	   
	 
   }
}
