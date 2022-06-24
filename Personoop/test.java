package Personoop;

public class test {
 public static void main(String[] args) {
	 Person p = new Person();
	 p.setName("Sachin");
	 p.setDob(17081995);
	 p.setAddress("Indore");
	 String mp = p.getName();
	 long np = p.getDob();
	 String op = p.getAddress();
	 System.out.println(mp);
	 System.out.println(np);
	 System.out.println(op);
 }
}
