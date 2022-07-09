package day07;

public class Differencebetweenequalsmethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s ="welcome";
		String t ="welcome";
		
		
			System.out.println(s==t);
			System.out.println(s.equals(t));
			
			
		String st = new String("welcome");
		String tu = new String("welcome");
		
		
		System.out.println("================");
			
		
		String tt = new String("welcome");
		System.out.println(s==tt);  //false
		System.out.println(s.equals(tt)); //false
		
		String u =tt;	
		System.out.println(tt==u);  //true
			
		
	}

}
