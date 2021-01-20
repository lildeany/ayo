package com.revature.app;

public class Calc {

	public static void main(String[] args) {
		Calculate calculator = new Calculate();
		System.out.println (calculator.name);
		
		System.out.println (Calculate.add(10, 20));
		System.out.println (Calculate.subtract(20, 10));

	}

}
