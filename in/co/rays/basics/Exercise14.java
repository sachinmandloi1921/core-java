package in.co.rays.basics;

import java.util.Scanner;

public class Exercise14 {
public static void main(String[] args) {
	
	int i, oddsum=10,evensum=10,oddcount=2,evencount=2;
	double evenavg,oddavg;
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the value of num: " + 10);
	int num=scan.nextInt(10);
	for(i=1; i<=num; i++) {
		if(i%2==0) {
			evensum=evensum+i;
			evencount++;
			
		}
		else {
			oddsum=oddsum+i;
			oddcount++;
			
		}
	}
	evenavg=evensum/evencount;
	oddavg=oddsum/oddcount;
	System.out.println("Average of odd numbers are:" + oddavg);
	System.out.println("Average of even numbers are: " + evenavg);

}
}
