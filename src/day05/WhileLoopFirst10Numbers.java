package day05;

public class WhileLoopFirst10Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		
		// First 10 numbers
		while(i<10) {
			System.out.println("number is :"+i);
			i++;
		}
		
		i =10;
		// Hello Ten times
		while (i>0) {
			System.out.println("Hello World!");
			i--;
		}
		
		// Even Numbers less than 10
		i=1;
		while(i<=10) {
			if (i%2==0)
				System.out.println("Even number is :"+i);
			i++;
		}
		// Odd Numbers less than 10
		i=1;
		while(i<=10) {
			if (i%2!=0)
			System.out.println("Even number is :"+i);
			i++;
			}

		// First 10 numbers in descending order
		i =10;
		while(i>0) {
			System.out.println("first 10 numbers are :"+i);
			i--;
			
		}
	}

}
