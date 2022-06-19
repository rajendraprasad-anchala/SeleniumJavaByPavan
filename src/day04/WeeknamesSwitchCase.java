package day04;

import java.util.Scanner;

public class WeeknamesSwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter week Number: ");
		int a = sc.nextInt();
		
		switch (a)
		{
			case 1 : System.out.println("Weekname is Sunday"); break;
			case 2 : System.out.println("Weekname is Monday"); break;
			case 3 : System.out.println("Weekname is Tuesday"); break;
			case 4 : System.out.println("Weekname is Wednesday"); break;
			case 5 : System.out.println("Weekname is Thursday"); break;
			case 6 : System.out.println("Weekname is Friday"); break;
			case 7 : System.out.println("Weekname is Saturday"); break;
			default : System.out.println("Weekname is Invalid"); break;
			
		}

		
		System.out.println("enter Weekname: ");
		String str = sc.next();
		
		switch (str)
		{
			case "Sunday" : System.out.println("weekNumber is :"+1); break;
			case "Monday" : System.out.println("weekNumber is: "+ 2); break;
			case "Tuesday" : System.out.println("weekNumber is :"+ 3); break;
			case "Wednesday" : System.out.println("weekNumber is :"+ 4); break;
			case "Thursday" : System.out.println("weekNumber is :"+ 5); break;
			case "Friday" : System.out.println("weekNumber is :"+ 6); break;
			case "Saturday" : System.out.println("weekNumber is :"+ 7); break;
			default : System.out.println("weekNumber is Invalid"); break;
			
		}

	}

}
