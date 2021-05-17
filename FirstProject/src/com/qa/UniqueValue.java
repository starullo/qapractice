package com.qa;

public class UniqueValue {
	public static int uniqueValue(int num1, int num2, int num3) {
		if (num1 == num2) {
			if (num3 == num2) {
				return 0;
			} else {
				return num3;
			}
		} else if (num2 == num3) {
			if (num1 == num2) {
				return 0;
			} else {
				return num1;
			}
		} else if (num3 == num1) {
			if (num2 == num3) {
				return 0;
			} else {
				return num2;
			}
		} else {
			return num1 + num2 + num3;
		}
	}
	public static void main(String[] args) {
		uniqueValue(1, 2, 3);
	}
}
