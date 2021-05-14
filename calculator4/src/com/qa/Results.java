package com.qa;

public class Results {
	
	public static int physics = 100;
	public static int chemistry = 105;
	public static int biology = 92;
	public static int total = physics + chemistry + biology;
	public static double percentage = (total * 100) / 450;
	public static String outOf = "/150";
	
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
		System.out.println("*TOTAL: " + total + "450" + "*");
		System.out.println("***" + percentage() + "***");
	}
	
	public static String percentage() {
		double percent = (total * 100) / 450;
		return "" + percent + "%";
	}
}
