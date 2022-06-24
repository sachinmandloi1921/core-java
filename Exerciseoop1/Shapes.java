package Exerciseoop1;

abstract class Shapes {
	private String name;
	  
	public Shapes() {
		this.name = "Unknown shape";
	}
     public Shapes(String name) {
    	 this.name=name;
     }
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	  public abstract void draw();
	  
	  public abstract double getarea();
	  
	  
}
