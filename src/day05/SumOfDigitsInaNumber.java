package day05;

public class SumOfDigitsInaNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i =123243;
		
		int sum =0;
		
		while (i>0) {
			
			
			sum =sum + i%10;
			i = i/10;		
			
		}
		
		System.out.println("SUm of digits in a given number is:"+ sum);

	}

}
