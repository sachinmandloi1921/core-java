package in.co.rays.basics;

public class Exercise15 {
	public static void main(String[] args) {
		int[]a= {1,15,25,89,0,569,7895,236,125,321,785};
		int max=a[0];
		for(int i = 1; i<a.length; i++) {
			if (max<a[i]) {
				max=a[i];
				
			}
		//	System.out.println(max);
		}			System.out.println(max);
	}

}
