package day05;

public class CountNumberofOddandEvenDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i =1234567999,even=0,odd=0,j=0;
		
		while(i>0) {
			//j=i%10;
			if( (i%10)%2==0)
				even++;
			else
				odd++;
			i=i/10;
		}
		System.out.println("Number of Even Numbers is:"+even);
		System.out.println("Number of Odd Numbers is:"+odd);
		
	}

}
