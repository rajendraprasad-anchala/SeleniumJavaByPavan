package day05;

public class ReverseaNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i =1234;
		int rev =0;
		int original =1234;
		System.out.println("Original Number is "+i);
		
		while (i>0) {
			
			rev = i%10 + rev*10;
			i = i /  10;
			
			
		}

		
		System.out.println("Reverse Number is :" + rev);
		
		
		// Palindrome Check
		
		if (original == i )
			System.out.println("It is a Palindrome Number");
		else
			System.out.println("It is not a Palindrome number");
	}

}
