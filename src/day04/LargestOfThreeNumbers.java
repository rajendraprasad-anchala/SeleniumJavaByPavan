package day04;

import java.util.Scanner;

public class LargestOfThreeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter three values: value 1 is :");
		int a = sc.nextInt();
		System.out.println("enter three values: value 2 is :");
		int b = sc.nextInt();
		System.out.println("enter three values: value 3 is :");
		int c = sc.nextInt();
		
		if (a>b && a>c){
			System.out.println("largest of three numbers is :"+ a);
			
		}
		else if ( b>a && b>c) {
			System.out.println("largest of three numbers is : " +b);
		}
		
		else
			System.out.println("Largest of three numbers is : "+c);
		

	}

}
