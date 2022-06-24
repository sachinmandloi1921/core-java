package in.co.rays.basics;

public class Exercise10 {
	public static void main(String[] args) {
		int number = 420, originalnumber, remainder,result = 0;
		originalnumber=number;
		
		while(originalnumber!=0)
		{
			remainder = originalnumber % 10;
			result+= Math.pow(remainder, 3);
			originalnumber/=10;
			
		}
		
		if (result==number)
			System.out.println(number +" "+ "It is an armstrong number");
		else
			System.out.println(number +"  "+ " It is not an armstrong number");
		
		
		
	}

}
