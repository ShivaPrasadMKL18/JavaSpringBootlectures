package com.abstraction;

abstract class Airthmetic extends Car {
	public abstract int multiplication(int a, int b);	

	public int division(int a, int b) {
		return a/b;
	}

	public int addition(int a, int b) {
		return a+b+a+b;
	}

	public abstract int substraction(int a, int b);
}