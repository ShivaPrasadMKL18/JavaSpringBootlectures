package com.exception;

public class ExceptionHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//		try {
		//
		//			int a = 1/0;
		//		} catch (Exception e) {
		//			e.printStackTrace();
		//			System.out.println(e.getMessage());
		//		}

		try {
			applyApply();
		} catch (Exception e) {
			System.out.println("in main()");
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println("in main() ended");
		}
	}

	private static void applyApply() throws ArrayIndexOutOfBoundsException {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5};
		try {
			arr[8] = 8;
		} catch (Exception e) {	
			System.out.println("in ()");
			throw e;
		}  
	}
}
