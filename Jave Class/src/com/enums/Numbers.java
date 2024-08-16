package com.enums;

enum Numerics {
	 ONE,
	 TWO,
	 THREE
}

enum hostname {
	LOCAL_HOST,
	DEV_ENV_HOST,
	FEATURE_ENV_HOST,
	PROD_ENV_HOST,
}

enum ArithmeticOps {
	PLUS, 
	MINUS, 
	MULTIPLY, 
	DIVIDE
}

class Helper {
	final static String plus = "+";
	final static String minus = "-";
}

public class Numbers {
	public static void main (String[] args) {
		System.out.println(Numerics.ONE);
		ArithmeticOps ops = ArithmeticOps.PLUS;
		
		switch (ops) {
			case PLUS : break;
		}
	}
}
