package day06;

/* Array concept:
 * Initialization
 * declaration
 * Single Dimension / Multiple dimension
 * Insert values
 * Find size
 * Read values at run time
 * Object type Array
 */

public class Arraysconcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a1 [] = { 1,2,3,4,5,6};
		
		for (int i =0 ; i< a1.length ;i++) {
			System.out.println(a1[i]);
		}
		
		for (int i:a1) {
			System.out.println(i);
		}
		
		int a[][] = {{1,2},{3,4},{5,6}};
		
		for (int i=0; i< a.length ;i++) {
			for (int j =0; j<a[i].length ; j++) {
			System.out.print(a[i][j]+",");
		}
			System.out.println();
		
		}
		System.out.println(a.length);
		
		for ( int i[]:a) {
			for (int j:i) {
				System.out.print(j+",");
			}
			System.out.println();
		}
	}

}
