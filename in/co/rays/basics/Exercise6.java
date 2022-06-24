package in.co.rays.basics;

public class Exercise6 {
	public static void main(String[] args) {
		 int n=10, n1=0, n2=1;
		 System.out.println("Fibonacci Series");
		 for (int i= 1; i<=n; ++i) {
			 System.out.print(n1+" ,");
			 
			 int N=n1+n2;
			 n1=n2;
			 n2=N;
			 
		 }
	}

}
