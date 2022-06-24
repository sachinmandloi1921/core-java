package in.co.rays.basics;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Testdate {
	public static void main(String[] args) throws ParseException {
		Date d = new Date();
		System.out.println("Date : " +d);
		System.out.println ("Long Time : " +d.getTime());
		SimpleDateFormat f=new SimpleDateFormat("dd/mm/yyyy");
		String s=f.format(d);
		System.out.println(s);
		String s1="22/1/99";
		Date d1=f.parse(s1);
	}

}
