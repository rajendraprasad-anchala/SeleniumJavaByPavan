package day1;

import java.util.Scanner;

public class TakingInputfromKeyboard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		System.out.println("Enter first value:");
		int a  = s.nextInt();
		System.out.println("Enter second value:");
		int b  = s.nextInt();
		
		System.out.println("Enter the name of the person:");
		
		String name = s.next();
		
		System.out.println("Sum of two numbers is:"+(a+b));
		
		System.out.println("name of the person is:"+name);
		
	}

}
