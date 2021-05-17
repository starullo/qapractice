package com;

public class Flowchart {
	
	public static int shortMethod(int num1, int num2, boolean b) {
		if (b) {
			return num1 + num2;
		} else {
			return num1 * num2;
		}
	}
	
	public static void longMethod(int A) {
		if (A > 2000) {
			System.out.println("A");
			if (A > 6000) {
				System.out.println("C");
			} else {
				System.out.println("B");
				if (A > 4000) {
					System.out.println("D");
				} else {
					System.out.println("E");
				}
			}
		} else {
			System.out.println("1");
			if (A > 100) {
				System.out.println("3");
				if (A > 600) {
					System.out.println("5");
				} else {
					System.out.println("4");
					if (A > 500) {
						System.out.println("6");
					} else {
						System.out.println(7);
					}
				}
			} else {
				System.out.println("2");
			}
		}
	}
	
	public static void main(String[] args) {
		longMethod(400);
	}

}
