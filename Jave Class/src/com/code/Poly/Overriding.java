package com.code.Poly;

class Apple { 
	public String add(int a, int b) {
		// TODO Auto-generated method stub
		return "Apple add";
	}

	public int add(int a, int b, int c) {
		// TODO Auto-generated method stub
		return 0;
	}
}

class Banana extends Apple {
	public String add(int a, int b) {
		// TODO Auto-generated method stub
		return "Banana add";
	}
	
	public int sub(int a, int b, int c) {
		// TODO Auto-generated method stub
		return 0;
	}
}

public class Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Banana b = new Banana();
		System.out.println(b.add(4, 5));

	}

}

/*
 * polymorphism : https://www.w3resource.com/java-exercises/index-polymorphism.php
 * encapsulation : https://www.w3resource.com/java-exercises/encapsulation/index.php
 * interface : https://www.w3resource.com/java-exercises/index-interface.php
 * 
 * */
