package com.qa;

public class Results {
	
	public static int physics = 150;
	public static int chemistry = 90;
	public static int biology = 50;
	public static int total = physics + chemistry + biology;
	public static double percentage = (total * 100) / 450;
	public static String outOf = "/150";
	public static double percentageToPass = 60.0;
	public static double physicsPercentage = (physics * 100) / 150;
	public static double chemistryPercentage = (chemistry * 100) / 150;
	public static double biologyPercentage = (biology * 100) / 150;
	
	public static void main(String[] args) {
		displayResults();
		
	}
	
	public static void displayResults() {
		System.out.println("====================");
		System.out.println("=     RESULTS      =");
		System.out.println("====================");
		System.out.println(" ");
		System.out.println("PHYSICS: " + physics + outOf);
		System.out.println("CHEMISTRY: " + chemistry + outOf);
		System.out.println("BIOLOGY: " + biology + outOf);
		System.out.println("\n*TOTAL: " + total + "/450" + "*");
		System.out.println("***** " + percentage() + " *****");
		if (percentage < percentageToPass || physicsPercentage < 60 || biologyPercentage < 60 || chemistryPercentage < 60) {
			System.out.println("You have failed");
		}
		if (physicsPercentage < 60) {
			String message = "Subjects failed: Physics";
			if (chemistryPercentage < 60) {
				message += ", Chemistry";
			}
			if (biologyPercentage < 60) {
				message += ", Biology";
			}
			System.out.println(message);
		} else if (chemistryPercentage < 60) {
			String message = "Subjects failed: Chemistry";
			if (physicsPercentage < 60) {
				message += ", Physics";
			}
			if (biologyPercentage < 60) {
				message += ", Biology";
			}
		} else if (biologyPercentage < 60) {
			String message = "Subjects failed: Biology";
			if (physicsPercentage < 60) {
				message += ", Physics";
			}
			if (chemistryPercentage < 60) {
				message += ", Chemistry";
			}
			System.out.println(message);
		} else {
			System.out.println("You have passed");
		}
		
	}
	
	public static String percentage() {
		double percent = (total * 100) / 450;
		return "" + percent + "%";
	}
}
