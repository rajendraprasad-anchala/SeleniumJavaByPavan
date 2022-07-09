package day07;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class StringFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//length , charAt() , Substring(a,b) , contains() equals() concat() trim()
		
		String s1 = "welcome" ;
		String s2 = "to the Selenium";
		String s3 = "with Java";
		
		System.out.println(s1+"  "+s2+"  "+s3);
		
		// CharAt()
		System.out.println(s1.charAt(3));
		
		//length
		System.out.println(s1.length());
		//equals function
		String s ="Welcome";
		System.out.println(s1.equals(s));
		//equalsIgnoreCase()
		System.out.println(s1.equalsIgnoreCase(s));
		
		
		//replace()
		String str = "Welcome to the selenium automation testing, selenium is very hot in the market";
		
		System.out.println(str);
		
		System.out.println(str.replace("selenium", "API"));
		
		//substring()
		
		System.out.println(str.substring(15));
		System.out.println(str.substring(7,str.length()));
		
		System.out.println("--------------");
		//split()  => String array variable
		String st[] = str.split(" ");
		for ( String sing:st) {
			System.out.println(sing);
		}
		
		System.out.println("--------------");
		
		//contains()
		System.out.println(s1.contains("Wel"));
		
		//concat()
		System.out.println(s1.concat(s2).concat(s3));
		
		String s4 = "    welcome   ";
		System.out.println(s4.length());
		
		
		//trim
		System.out.println(s4.trim().length());
		
		
		

	}

}
