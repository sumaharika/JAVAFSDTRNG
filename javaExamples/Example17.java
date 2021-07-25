package com.ust.examples;
/*
 * string Replace
 * 
 */

public class Example17 {

	public static void main(String[] args) {
		String str="Replace Region";
		/*replace all occurances of given character with new one
		  and returns new string object 
		 */
		System.out.println(str.replace('R','A'));
		/*
		 * replace only first occurances of given string with new one
		 * and returns new string object
		 */
		System.out.println(str.replaceFirst("Re", "Ra"));
		/*replace all occurances of given string with new one
		  and returns new string object 
		 */
		System.out.println(str.replace("Re", "Ra"));
		
		
		
	}

}
