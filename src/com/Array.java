package com;

public class Array {

	public static void main(String[] args) {
		bonusTask();
	}
	public static void methodOne() {
		int[] arrOne = new int[10];
		arrOne[0] = 1;
		arrOne[1] = 2;
		arrOne[2] = 3;
		arrOne[3] = 4;
		arrOne[4] = 5;
		arrOne[5] = 6;
		arrOne[6] = 7;
		arrOne[7] = 8;
		arrOne[8] = 9;
		arrOne[9] = 10;
		System.out.println(arrOne[0]);
		System.out.println(arrOne[1]);
		System.out.println(arrOne[2]);
		System.out.println(arrOne[3]);
		System.out.println(arrOne[4]);
		System.out.println(arrOne[5]);
		System.out.println(arrOne[6]);
		System.out.println(arrOne[7]);
		System.out.println(arrOne[8]);
		System.out.println(arrOne[9]);

	}
	
	public static void methodTwo() {
		int[] arrTwo = new int[10];
		int num = 1;
		for (int i = 0; i < 10; i++) {
			arrTwo[i] = num;
			num += 3;
			System.out.println(arrTwo[i]);
		}
		
	}
	
	public static void enhancedForLoop() {
		String[] stringsArr = {"StringOne", "StringTwo", "StringThree", "StringFour", "StringFive"};
		for (String curString : stringsArr) {
			System.out.println(curString);
		}
	}
	
	public static void bonusTask() {
		String output = "";
		for (int i = 0; i < 5; i++) {
			if (i == 0 || i == 4) {
				output += "[=][=][=][=][=]\n";
			} else if (i == 1 || i == 3) {
				output += "[=][-][-][-][=]\n";
			} else {
				output += "[=][-][X][-][=]\n";
			}
			
		}
		System.out.println(output);
		
	}
}
