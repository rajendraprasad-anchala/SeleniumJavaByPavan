package day07;

import java.util.Arrays;

public class SortingvaluesinStringArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str[] = {"abc","aac","acb","bbc","bba"};
		
		System.out.println("before sorting : " + Arrays.toString(str));
		Arrays.sort(str);
		System.out.println("after sorting :"+Arrays.toString(str));

		int a [] = {12,34,556,32,19,11,10,9};
		
		System.out.println("before sorting :" + Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("after sorting :"+Arrays.toString(a));
	}

}
