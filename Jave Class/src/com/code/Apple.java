package com.code;

interface Addition {
	public int add(int a, int b);

	public int add(int a, int b, int c);

	public int sub(int a, int b);
}

interface Substraction {
	public int sub(int a, int b);

	public int sub(int a, int b, int c);
}

public class Apple implements Addition, Substraction {

	@Override
	public int sub(int a, int b, int c) {
		// TODO Auto-generated method stub
		return a-b-c;
	}

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public int add(int a, int b, int c) {
		// TODO Auto-generated method stub
		return a+b+c;
	}

	@Override
	public int sub(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	public static void main(String[] args) {
		Apple apple = new Apple();
		System.out.println(apple.add(5, 6));
	}

}
