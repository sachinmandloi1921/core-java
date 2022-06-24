package in.co.rays.basics;

public class FormatDate {
public static void main(String[] args) {
int a=90;
int b=90;
	
	
	add(a,b);
	mul(a,b);
	div(a,b);
	sub(a,b);
}

public static void sub(int a,int b) {
	int c=a-b;
	System.out.println(c);
	
}

public static void div(int a,int b) {
	int c=a/b;
	System.out.println(c);
	
}

public static void mul(int a,int b) {


	int c=a*b;
	System.out.println(c);
	
}

public static void add(int a,int b) {
	
	int c=a+b;
	System.out.println(c);
}
}
