package com.qaprintHelloWorld3;

public class PrintHelloWorld3 {
	public static int startingNum;
	public static String message;
	
	public static void main(String[] args) {
		
		
		System.out.println(message + " " + startingNum);
		
		
		startingNum = 5;
		message = "The value of the number is ";
		
		System.out.println(message + startingNum);
		
		
		startingNum = 2;
		message = "The value of the number is now ";
		
		System.out.println(message + startingNum);
		
	}
}