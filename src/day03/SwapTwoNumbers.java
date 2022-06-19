package day03;

public class SwapTwoNumbers {

	public static void main(String[] args) {
	
		int a=10,b=20;
		
		System.out.println("The value of a before swap:"+a);
		System.out.println("The value of b before swap:"+b);
		
		//using third variable
		
		/*
		 * int temp; temp=a; //10 a=b; //20 b=temp; //10
		 * System.out.println("---using third variable---");
		 * System.out.println("The value of a after swap:"+a);
		 * System.out.println("The value of b after swap:"+b);
		 */
		 
		  //using +,- operators
		
		  a=a+b; //30 
		  b=a-b; //10 
		  a=a-b; //20
		  System.out.println("--- using +,- operators ---");
		  System.out.println("The value of a after swap:"+a);
		  System.out.println("The value of b after swap:"+b);
		 
		  //using *,/ operators
		  
		  a=10;b=20; 
		  a=a*b; //200
		  b=a/b; //10
		  a=a/b; //10
		  System.out.println("--- using *,/ operators ---");
		  System.out.println("The value of a after swap:"+a);
		  System.out.println("The value of b after swap:"+b);
		  
		  //using single line expression (from right to left)
		  
		  a=10;b=20;
		  b=a+b-(a=b);
		  System.out.println("--- using singleline ---");
		  System.out.println("The value of a after swap:"+a);
		  System.out.println("The value of b after swap:"+b);
		
		

	}

}
