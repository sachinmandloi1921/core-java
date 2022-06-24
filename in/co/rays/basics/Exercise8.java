package in.co.rays.basics;

public class Exercise8 {
	public static void main(String[] args) {
		int[][] tables= new int[10][10];
				
       int c=1;
		
		for(int i=0;i<10;i++) {
			for(int j=2;j<=10;j++) {
				c=(i+1)*(j);
				System.out.print(c+"\t");
			}
			System.out.println();
	}

	}

}
