package com.code.Poly;

/*
 * Method overloading - Method name is same but can have 
 * 						different parameters with different data types.
 * Method overriding - one methods from parent class overriding the child class method.
 * 
 * */

public class Overloading {
	public int add(int a, int b) {
		return a+b;
	}

	public double add(double a, double b) {
		return a+b;
	}

	public double add(double a, double b, double c) {
		return a+b+c;
	}

	public int add(int a, int b, int c, int d) {
		return a+b+c+d;
	}
}
