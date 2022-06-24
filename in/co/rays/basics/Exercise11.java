package in.co.rays.basics;

public class Exercise11 {
	public static void main(String[] args) {
		int n=40;
		boolean flag=false;
		for(int i =2; i<=n/2; ++i) {
			if (n%i==0) {
				flag=true;
				break;
				
			}
		}
		if(!flag)
			System.out.println(n + " " + "It is a prime number");
		
		else 
			System.out.println(n + " " + "It is a not prime number");
	}
	

}
