package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		"cool" -> "[a-z]"
//		"cool" -> "[abcdefghi-z]
		Pattern pattern = Pattern.compile("CSS", Pattern.CASE_INSENSITIVE); // input str
		Matcher matcher = pattern.matcher("HTML CSS JAVASCRIPT"); // regex
		if (matcher.find()) {
			System.out.println("Matched");
		} else {
			System.out.println("Not Matched");
		}
		
		boolean flag = "htm09048l".matches("^[a-zA-Z]+$");
		
		if (flag) {
			System.out.println("Matched");
		} else {
			System.out.println("Not Matched");
		}	
	} 
}
