package day05;

public class CountNumberofDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i =123456;
		int count=0;
		
		while ( i>0) {
			i= i/10;
			count++;
			
		}
		
		System.out.println("Number of Digits :"+count);
	}

}
