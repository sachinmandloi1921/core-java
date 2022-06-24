package Exerciseoop5;

final class Immutable {
	private String name;
	private int date;
	public Immutable(String name, int date) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.date=date;
		
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		this.date = date;
	}

}
