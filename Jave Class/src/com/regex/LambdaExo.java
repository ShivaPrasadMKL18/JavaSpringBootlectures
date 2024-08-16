package com.regex;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LambdaExo {

	public static void main(String args[]) {

		String[] ar1 = new String[10]; // arrays

		List<String> arr = new ArrayList<String>(); // lists

		arr.add("apple");
		arr.add("banana");
		arr.add("pineapple");
		arr.add("berry");
		arr.add("green-apple");

		arr.forEach(item -> System.out.println(item) ); // lambda exp


		
		
		
		Map<String, Integer> map = new HashMap<String, Integer>();

		map.put("John", 25);
		map.put("Alice", 30);
		map.put("Bob", 35);

		map.keySet().forEach(key -> System.out.println(key + " " + map.get(key) ) ); // lambda exp
		
		
	}
}
