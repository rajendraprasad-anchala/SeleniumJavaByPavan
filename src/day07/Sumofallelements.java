package day07;

public class Sumofallelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {1,2,3,4,5,6};
		int b=0;
		int even = 0 ;
		int odd = 0;
		
		for (int x :a) {
			b=b+x;
			if ( x%2==0) {
				even = even+1;
			}
			else
				odd = odd+1;
		}
		
		System.out.println("Sum of all elements in the array :"+b);
		
		System.out.println("Even numberscount is: "+ even);
		System.out.println("Odd numbers count is : "+odd);

	}

}
