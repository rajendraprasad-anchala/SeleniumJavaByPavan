package day07;

public class ArraySearchvalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Linear Search
		
		int a[] = {1,2,3,4,5,6,7,8,9,122,344,5556,677};
		
		int b = 15;
		
		boolean found = false;
		
		for (int x:a) {
			if(x==b)
			{
				System.out.println("found");
				found =true;
				break;
			}
		}
		
		if(found == false) {
			System.out.println("not found");
		}
		
		

	}

}
