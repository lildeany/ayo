package com.revature.app;

public class Casting {

	public static void main(String[] args) {
		// implicit casting
		long myLong;
		int myInt = 1000;
		myLong = myInt;
		System.out.println(myLong);
		System.out.println(myInt);
		
		double a = 13.5;
		int myInt2;
		myInt2 = (int) a;
		System.out.println(myInt2);

	}

}
