package Personoop;

import java.util.Date;

public class Testperson {
   public static void main(String[] args) {
	   Person p = new Person();
	   p.setName("Sachin");
	   p.setAddress("Texas America");
	   p.setDob(17081995l);
	   String mp = p.getName();
	   String np = p.getAddress();
	   double op = p.getDob();
	   System.out.println(mp);
	   System.out.println(np);
	   System.out.println(op);
	   
   }
}
