package com;

public class Iteration {
	
	public static int methodOne(int num) {
		if (num < 10 || num > 99) {
			return 0;
		} else {
			int right = num % 10;
			int left = num / 10;
			return right + left;
		}
	}
	
	public static String methodTwo(int num) {
		if (num < 1 || num > 9999) {
			return "Number is out of range. Must be between 1-999";
		}
		String numString = "" + num;
		String first = "";
		String second = "";
		String third = "";
		String fourth = "";
		if (numString.length() == 2) {
		int right = num % 10;
		int left = num / 10;
		switch(left) {
		case 1:
			return methodTwoHelper(right);
		case 2:
			first = "twenty";
			break;
		case 3:
			first = "thirty";
			break;
		case 4:
			first = "fourty";
			break;
		case 5:
			first = "fifty";
			break;
		case 6:
			first = "sixty";
			break;
		case 7:
			first = "seventy";
		case 8:
			first = "eighty";
			break;
		default:
			first = "ninety";
	}
		if (right == 0) {
			return first;
		} else {
			switch(right) {
			case 1:
				second = "-one";
				break;
			case 2:
				second = "-two";
				break;
			case 3:
				second = "-three";
				break;
			case 4:
				second = "-four";
				break;
			case 5:
				second = "-five";
				break;
			case 6:
				second = "-six";
				break;
			case 7:
				second = "-seven";
				break;
			case 8:
				second = "-eight";
				break;
			default:
				second = "-nine";
			}
			return first + second;
		}
		} else if (numString.length() == 3) {
			
			first = "";
			second = "";
			third = "";
			switch(numString.charAt(0)) {
			case '1':
				first = "one hundred";
				break;
			case '2':
				first = "two hundred";
				break;
			case '3':
				first = "three hundred";
				break;
			case '4':
				first = "four hundred";
				break;
			case '5':
				first = "five hundred";
				break;
			case '6':
				first = "six hundred";
				break;
			case '7':
				first = "seven hundred";
				break;
			case '8':
				first = "eight hundred";
				break;
			default:
				first = "nine hundred";
				
			}
			switch(numString.charAt(1)) {
			case '1':
				return first + "-" + methodTwoHelperTwo(numString.charAt(2));
			case '2':
				second = "-twenty";
				break;
			case '3':
				second = "-thirty";
				break;
			case '4':
				second = "-fourty";
				break;
			case '5':
				second = "-fifty";
				break;
			case '6':
				second = "-sixty";
				break;
			case '7':
				second = "-seventy";
				break;
			case '8':
				second = "-eighty";
				break;
			case '0':
				second = "";
				break;
			default:
				second = "-ninety";
			}
			switch(numString.charAt(2)) {
			case '1':
				third = "-one";
				break;
			case '2':
				third = "-two";
				break;
			case '3':
				third = "-three";
				break;
			case '4':
				third = "-four";
				break;
			case '5':
				third = "-five";
				break;
			case '6':
				third = "-six";
				break;
			case '7':
				third = "-seven";
				break;
			case '8':
				third = "-eight";
				break;
			default:
				third = "-nine";
			}
			return first + second + third;
		} else {
			first = "";
			second = "";
			third = "";
			fourth = "";
			
			switch(numString.charAt(0)) {
			case '1':
				first = "one";
				break;
			case '2':
				first = "two";
				break;
			case '3':
				first = "three";
				break;
			case '4':
				first = "four";
				break;
			case '5':
				first = "five";
				break;
			case '6':
				first = "six";
				break;
			case '7':
				first = "seven";
				break;
			case '8':
				first = "eight";
				break;
			default:
				first = "nine";
			}
			first += " thousand";
			
			switch(numString.charAt(1)) {
			case '0':
				second = " ";
				break;
			case '1':
				second = "-one hundred";
				break;
			case '2':
				second = "-two hundred";
				break;
			case '3':
				second = "-three hundred";
				break;
			case '4':
				second = "-four hundred";
				break;
			case '5':
				second = "-five hundred";
				break;
			case '6':
				second = "-six hundred";
			case '7':
				second = "-seven hundred";
				break;
			case '8':
				second = "-eight hundred";
				break;
			default:
				second = "-nine hundred";
			}
			
			switch(numString.charAt(2)) {
			case '0':
				third = "";
				break;
			case '1':
				return first + second + methodTwoHelperTwo(numString.charAt(3));
			case '2':
				third = "-twenty";
				break;
			case '3':
				third = "-thirty";
				break;
			case '4':
				third = "-fourty";
				break;
			case '5':
				third = "-fifty";
				break;
			case '6':
				third = "-sixty";
				break;
			case '7':
				third = "-seventy";
				break;
			case '8':
				third = "-eighty";
				break;
			default:
				third = "-ninety";
				
			}
			
			switch(numString.charAt(3)) {
			case '0':
				fourth = "";
				break;
			case '1':
				fourth = "-one";
				break;
			case '2':
				fourth = "-two";
				break;
			case '3':
				fourth = "-three";
				break;
			case '4':
				fourth = "-four";
				break;
			case '5':
				fourth = "-five";
				break;
			case '6':
				fourth = "-six";
				break;
			case '7':
				fourth = "-seven";
				break;
			case '8':
				fourth = "-eight";
				break;
			default:
				fourth = "-nine";
			}
			return first + second + third + fourth;
		}
	}
	
	public static String methodTwoHelper(int num) {
		String result;
		switch(num) {
		case 0:
			result = "ten";
			break;
		case 1:
			result = "eleven";
			break;
		case 2:
			result = "twelve";
			break;
		case 3:
			result = "thirteen";
			break;
		case 4:
			result = "fourteen";
			break;
		case 5:
			result = "fifteen";
			break;
		case 6:
			result = "sixteen";
			break;
		case 7:
			result = "seventeen";
			break;
		case 8:
			result = "eighteen";
			break;
		default:
			result = "nineteen";
		}
		return result;
	}
	
	public static String methodTwoHelperTwo(char c) {
		String result;
		switch(c) {
		case '0':
			result = "ten";
			break;
		case '1':
			result = "eleven";
			break;
		case '2':
			result = "twelve";
			break;
		case '3':
			result = "thirteen";
			break;
		case '4':
			result = "fourteen";
			break;
		case '5':
			result = "fifteen";
			break;
		case '6':
			result = "sixteen";
			break;
		case '7':
			result = "seventeen";
			break;
		case '8':
			result = "eighteen";
			break;
		default:
			result = "nineteen";
		}
		return result;
	}
	
}
