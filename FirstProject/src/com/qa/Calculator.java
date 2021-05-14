package com.qa;

public class Calculator {
	

	public static void main(String[] args) {
		System.out.println(add(2, 5));
		System.out.println(subtract(10, 4));
		System.out.println(multiply(3, 5));
		System.out.println(divide(20.0, 10.0));

	}
	
	
	public static int add(int num1, int num2) {
		return num1 + num2;
	}
	
	public static int subtract(int num1, int num2) {
		return num1 - num2;
	}
	
	public static int multiply(int num1, int num2) {
		return num1 * num2;
	}
	
	public static double divide(double num1, double num2) {
		return num1 / num2;
	}

}
