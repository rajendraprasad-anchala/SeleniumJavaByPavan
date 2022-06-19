package day04;

import java.util.Scanner;

public class MonthNumbersSwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter Month Number: ");
		int a = sc.nextInt();
		
		switch (a)
		{
			case 1 : System.out.println("Weekname is January"); break;
			case 2 : System.out.println("Weekname is February"); break;
			case 3 : System.out.println("Weekname is March"); break;
			case 4 : System.out.println("Weekname is April"); break;
			case 5 : System.out.println("Weekname is May"); break;
			case 6 : System.out.println("Weekname is June"); break;
			case 7 : System.out.println("Weekname is July"); break;
			case 8 : System.out.println("Weekname is August"); break;
			case 9 : System.out.println("Weekname is September"); break;
			case 10 : System.out.println("Weekname is October"); break;
			case 11: System.out.println("Weekname is November"); break;
			case 12 : System.out.println("Weekname is December"); break;
			default : System.out.println("Weekname is Invalid"); break;
			
		}
	}

}
