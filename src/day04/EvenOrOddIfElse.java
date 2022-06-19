package day04;

public class EvenOrOddIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 15;
		
		if(a%2==0) {
			System.out.println("Number is Even Number");
		}
		else {
			System.out.println("Number is Odd Number");
		}
		
		
		// using the ternary operator
		
		//String result = (a%2==0)? "evennumber" : "Oddnumber";
		
		System.out.println("Number is " + ((a%2==0)? "even number" : "Odd number"));

	}

}
