package Automobleoop;

public class Automobile {
	private String color;
	private int speed;
	private String make;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public void breck(int s) {
		speed = speed-s;
		
	}
     public void changeGear(int c) {
    	 speed=speed-c;
    	 
     }
     public void accelerator(int a) {
    	 speed=speed+a;
    	 
     }
}
