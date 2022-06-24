package in.co.rays.basics;

public class Exercise12 {
	public static void main(String[] args) {
		int N=3211234, reversednum=0, remainder;
		int originaln=N;
		 while(N!=0) {
			 remainder = N% 10;
			 reversednum = reversednum * 10 + remainder;
			 
			 N/=10;
			 
			  }
		 if (originaln==reversednum) {
			 System.out.println(originaln +" " + "It is palindrome number");
		 }	 
			 
			 else {
				 System.out.println(originaln +" " + "It is not palindrome number");
			 }
				 
		 }
		
	}


