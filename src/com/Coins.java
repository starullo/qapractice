package com;

public class Coins {
	public static String getChange(double cost, double amount) {
		String diffStr = String.format("%.2f", cost - amount);
		float difference = Float.parseFloat(diffStr);
		int hundreds = 0;
		int fifties = 0;
		int twenties = 0;
		int tens = 0;
		int fives = 0;
		int ones = 0;
		int quarters = 0;
		int dimes = 0;
		int nickels = 0;
		int pennies = 0;
		
		return "wow";
		
//		
//		while (difference > 0) {
//			if (difference >= 100) {
//				difference = difference - 100;
//				hundreds += 1;
//				continue;
//			}
//			else if (difference >= 50) {
//				difference = difference - 50;
//				fifties += 1;
//				continue;
//			}
//			else if (difference >= 20) {
//				difference = difference - 20;
//				twenties += 1;
//				continue;
//			}
//			else if (difference >= 10) {
//				difference = difference - 10;
//				tens += 1;
//				continue;
//			}
//			else if (difference >= 5) {
//				difference = difference - 5;
//				fives += 1;
//				continue;
//			}
//			else if (difference >= 1) {
//				difference = difference - 1;
//				ones += 1;
//				continue;
//			}
//			else if (difference >= .25) {
//				difference = difference - .25;
//				quarters += 1;
//				continue;
//			}
//			else if (difference >= .1) {
//				difference = difference - .25;
//				dimes += 1;
//				continue;
//			}
//			else if (difference >= .05) {
//				difference -= .05;
//				nickels += 1;
//				continue;
//			}
//			else if (difference >= .01) {
//				difference -= .01;
//				pennies += 1;
//				continue;
//			}
//		}
//		return "Your change is: " + hundreds + " hundreds," + fifties + " fifties," + twenties + " twenties," +
//				tens + " tens," + fives + " fives," + ones + " ones," + quarters + " quarters," + dimes +
//				" dimes," + nickels + " nickels," + pennies + " pennies";
//		
	}
}
