package com.regex;

public class StringBufferBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		String str = "Hello";
//		str += " World"; // Creates a new String object
//		System.out.println(str); // Immutable (cannot be changed once created
		
		
//		StringBuffer sb = new StringBuffer("Hello");
//		System.out.println(sb.hashCode());
//		sb.append(" World"); // Modifies the existing StringBuffer object
//		System.out.println(sb.toString()); // Output: "Hello World"
//		System.out.println(sb.hashCode()); // Mutable (can be changed after creation)
		
		StringBuilder sb = new StringBuilder("Hello");
		System.out.println(sb.hashCode());
		sb.append(" World"); // Modifies the existing StringBuilder object
		System.out.println(sb.toString()); // Output: "Hello World"
		System.out.println(sb.hashCode()); // Mutable (can be changed after creation)
	}

}
