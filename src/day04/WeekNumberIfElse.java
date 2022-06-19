package day04;

import java.util.Scanner;

public class WeekNumberIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter week values: ");
		int a = sc.nextInt();
		if(a==1) {
			System.out.println("Weekname is : Sunday");
		}
		else if(a==2) {
			System.out.println("Weekname is : Monday ");
		}
		else if(a==2) {
			System.out.println("Weekname is : Tuesday ");
		}
		else if(a==3) {
			System.out.println("Weekname is : Wednesday ");
		}
		else if(a==4) {
			System.out.println("Weekname is : Thursday ");
		}
		else if(a==5) {
			System.out.println("Weekname is : Friday ");
		}
		else if(a==6) {
			System.out.println("Weekname is : Saturday ");
		}
		else
			System.out.println("Invalid weeknumber");
		
	}

}
