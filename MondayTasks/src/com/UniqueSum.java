package com;

public class UniqueSum {
	public static int uniqueSum(int num1, int num2, int num3) {
		if (num1 == num2) {
			if (num3 != num1) {
				return num3;
			} else {
				return 0;
			}
		} else if (num2 == num3) {
			if (num1 != num2) {
				return num1;
			} else {
				return 0;
			}
		} else if (num3 == num1) {
			if (num2 != num1) {
				return num2;
			} else {
				return 0;
			}
		} else {
			return num1 + num2 + num3;
		}
}
	public static void main(String[] args) {
		System.out.println(uniqueSum(1, 2, 3));
	}
}
