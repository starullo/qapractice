package strings;

public class Strings {
	public static void main(String[] args) {
		System.out.println(methodFour("how are you doing", "you"));
	}
	public static void exerciseOne() {
		String strOne = "yesterday it was raining";
		String strTwo = "today it is sunny";
		
		String output = strOne.concat(" " + strTwo);
		
		System.out.println(output.toUpperCase());
		
		String newStrTwo = strTwo.replace("sunny", "raining");
		
		System.out.println(newStrTwo.toUpperCase());
		
	}
	
	public static int methodOne(String str) {
		int spaces = 0;
		for (int i = 0; i < str.length(); i++) {
			String curVal = str.substring(i, i + 1);
			if (curVal.equals(" ") && i != 0 && i != str.length() - 1) {
				spaces++;
			}
		}
		return  spaces + 1;
	}
	
	public static void methodTwo(String str) {
		String output = "";
		for (int i = 0; i < str.length(); i++) {
			String curVal = str.substring(i, i + 1);
			output += curVal + "\n";
		}
		System.out.println(output);
	}
	
	public static void methodThree(String str) {
		String output = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			String curVal = str.substring(i, i + 1);
			output += curVal + "\n";
		}
		System.out.println(output);
	}
	
	public static boolean methodFour(String message, String section) {
		int messageLength = message.length();
		int sectionLength = section.length();
		String firstLetter = section.substring(0, 1);
		
		for (int i = 0; i < message.length(); i++) {
			String curMessageVal = message.substring(i, i + 1);
			if (curMessageVal.equals(firstLetter)) {
				for (int j = 0; j < section.length();j++) {
					String curSectionVal = section.substring(j, j + 1);
					String newCurMessageVal = message.substring(i + j, i + j + 1);
					if (j == section.length() - 1) {
						if (curSectionVal.equals(newCurMessageVal)) {
							return true;
						} else {
							continue;
						}
					}
					else if (curSectionVal.equals(newCurMessageVal)) {
						continue;
					} else {
						break;
					}
				}
			}
		}
		return false;
	}
}
