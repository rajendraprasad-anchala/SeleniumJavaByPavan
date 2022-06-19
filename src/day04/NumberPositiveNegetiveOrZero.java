package day04;

import java.util.Scanner;

public class NumberPositiveNegetiveOrZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter the next program name");
		String s = sc.next();
		System.out.println("Enter the next integer value");
		int a = sc.nextInt();
		
		
		
		//int a  =Scanner (System.in("Enter value:"));
		
		
		if (a >0 ) {
			System.out.println("Number is greater than zero & Positive Number: " + s);
		}
		
		else if (a<0){
			System.out.println("Number is less than zero &  Negetive Number: "+s);
		}

		else if (a ==0) {
			System.out.println("number is zero :" +s);
		}
		
		else 
			System.out.println("Number is not an integer");
	}

}
