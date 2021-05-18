package strings;

public class Strings {
	public static void main(String[] args) {
		exerciseOne();
	}
	public static void exerciseOne() {
		String strOne = "yesterday it was raining";
		String strTwo = "today it is sunny";
		
		String output = strOne.concat(" " + strTwo);
		
		System.out.println(output.toUpperCase());
		
		String newStrTwo = strTwo.replace("sunny", "raining");
		
		System.out.println(newStrTwo.toUpperCase());
		
	}
}
