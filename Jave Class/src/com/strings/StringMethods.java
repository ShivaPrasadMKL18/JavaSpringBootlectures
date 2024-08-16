package com.strings;

public class StringMethods {

	public static void main(String args[]) {
		// TODO Auto-generated method stub
		
		String str = "Teaching kfbghjd java ";
		System.out.println( str.charAt(1) ); // character at index 
		System.out.println( str.codePointAt(1) ); 
		// a-z = 97 - 122 
		// A-Z = 65 - 90
		
		String str2 = "Teaching kfbh";
		
		System.out.println(str2.compareTo(str));  // 103 - 104 = 1
		System.out.println(str.compareTo(str2));  // 104 - 103 = -1
		
		// str.compareToIgnoreCase(str2)
		
		System.out.println(str.concat(str2));
		
		System.out.println(str.contains("ing kfb") );
		
		System.out.println(str.endsWith("java ") );
		
		System.out.println(str.equals("Teaching kfbghjd java "));
		
	} 
}
