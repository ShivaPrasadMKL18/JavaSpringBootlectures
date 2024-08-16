package com.code;

interface Addition1 {
	public int add(int a, int b);

	public int add(int a, int b, int c);

	public int sub(int a, int b);
}

interface Substraction1 extends Addition1 {
	public int sub(int a, int b);

	public int sub(int a, int b, int c);
}


public class Apple1 implements Substraction1 {

	public static void main(String[] args) {
		Apple apple = new Apple();
		 
	}

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int add(int a, int b, int c) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int sub(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int sub(int a, int b, int c) {
		// TODO Auto-generated method stub
		return 0;
	}
}
