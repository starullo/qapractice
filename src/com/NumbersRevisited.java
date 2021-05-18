package com;

public class NumbersRevisited {
	public static void printNums() {
		for (int i = 1; i <= 100; i++) {
			String left = "";
			String right = "";
			int d1 = i / 10;

			if (i < 10) {
				int d2 = 10 - i;
				switch(i) {
				case 1:
					right = "one";
					break;
				case 2:
					right = "two";
					break;
				case 3:
					right = "three";
					break;
				case 4:
					right = "four";
					break;
				case 5:
					right = "five";
					break;
				case 6:
					right = "six";
					break;
				case 7:
					right = "seven";
					break;
				case 8:
					right = "eight";
					break;
				default:
					right = "nine";
				}
				System.out.println(left + right);
			} else if (i < 20) {
				int d2 = 10 - (20 - i);
				switch(d2) {
				case 0:
					right = "ten";
					break;
				case 1:
					right = "eleven";
					break;
				case 2:
					right = "twelve";
					break;
				case 3:
					right = "thirteen";
					break;
				case 4:
					right = "fourteen";
					break;
				case 5:
					right = "fifteen";
					break;
				case 6:
					right = "sixteen";
					break;
				case 7:
					right = "seventeen";
					break;
				case 8:
					right = "eighteen";
					break;
				default:
					right = "nineteen";
				}
				System.out.println(left + right);
			} else if (i == 20) {
				System.out.println("twenty");
			} else if (i < 30) {
				int d2 = 10 - (30 - i);
				System.out.println("twenty" + numToStringHelper(d2));
			} else if (i == 30) {
				System.out.println("thirty");
			} else if (i < 40) {
				int d2 = 10 - (40 - i);
				System.out.println("thirty" + numToStringHelper(d2));
			} else if (i == 40) {
				System.out.println("fourty");
			} else if (i < 50) {
				int d2 = 10 - (50 - i);
				System.out.println("fourty" + numToStringHelper(d2));
			} else if (i == 50) {
				System.out.println("fifty");
			} else if (i < 60) {
				int d2 = 10 - (60 - i);
				System.out.println("fifty" + numToStringHelper(d2));
			} else if (i == 60) {
				System.out.println("sixty");
			} else if (i < 70) {
				int d2 = 10 - (70 - i);
				System.out.println("sixty" + numToStringHelper(d2));
			} else if (i == 70) {
				System.out.println("seventy");
			} else if (i < 80) {
				int d2 = 10 - (80 - i);
				System.out.println("seventy" + numToStringHelper(d2));
			} else if (i == 80) {
				System.out.println("eighty");
			} else if (i < 90) {
				int d2 = 10 - (90 - i);
				System.out.println("eighty" + numToStringHelper(d2));
			} else if (i == 90) {
				System.out.println("ninety");
			} else if ( i < 100) {
				int d2 = 10 - (100 - i);
				System.out.println("ninety" + numToStringHelper(d2));
			} else {
				System.out.println("one hundred");
			}
		} 				

	}
	public static String numToStringHelper(int num) {
		String result = "";
		switch(num) {
		case 1:
			result = "-one";
			break;
		case 2:
			result = "-two";
			break;
		case 3:
			result = "-three";
			break;
		case 4:
			result = "-four";
			break;
		case 5:
			result = "-five";
			break;
		case 6:
			result = "-six";
			break;
		case 7:
			result = "-seven";
			break;
		case 8:
			result = "-eight";
			break;
		case 0:
			result = "";
			break;
		case 10:
			result = "";
			break;
		default:
			result = "-nine";
		}
		return result;
	}
}
