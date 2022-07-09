package day07;

public class RevereseaString {

	public static void main(String[] args) {
		
		String str = "MADAMS";
		
		String rev ="";
		System.out.println(str.length());
		
		for (int i=str.length();i>0;i--) {
			System.out.println(str.substring(i-1,i));
			//rev = rev+str.substring(i-1,i);
			rev = rev + str.charAt(i-1);
//			System.out.println(rev);

		}
	
		System.out.println(rev);
		
		
		
	
}
}