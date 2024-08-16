package com.abstraction;

public class MainAbst extends Airthmetic {

	public static void main(String[] args) {
		MainAbst abs = new MainAbst();
		System.out.println(abs.addition(6, 4));
	}

	@Override
	public int multiplication(int a, int b) {
		// TODO Auto-generated method stub
		return a*b;
	}

	@Override
	public int substraction(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public void tyre() {
		// TODO Auto-generated method stub
		System.out.println("Car tyre");
	}
}
