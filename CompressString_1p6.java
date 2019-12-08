import java.util.ArrayList;



public class CompressString_1p6 {
	public String compress(String input) {
		if(input.isEmpty()) 
			return input;
		
		StringBuilder sb = new StringBuilder();

		int length = input.length();
		Character referenceChar = input.charAt(0);
		Integer countOfCharacters = 1;
		for(int index = 1 ; index < length; index++) {
			if(input.charAt(index) == referenceChar) 
				countOfCharacters++;
			else {
				sb.append(referenceChar);
				sb.append(countOfCharacters.toString());
				referenceChar = input.charAt(index);
				countOfCharacters = 1;
			}
		}

		if(input.length() > 1) {
			sb.append(referenceChar);
			sb.append(countOfCharacters.toString());
		}		

		String compressedString = sb.toString();
		if(compressedString.length() > input.length()) 
			return input;
		else
			return compressedString;


	}



	public static void main(String[] args) {

		System.out.println("My first line of code: ");

		CompressString_1p6 compressString = new CompressString_1p6();

		ArrayList<String> arrayOfStrings = new ArrayList<String>();
		arrayOfStrings.add("aabbcccccddee");
		arrayOfStrings.add("abcde");
		arrayOfStrings.add("accddeebbb");
		arrayOfStrings.add("accbdef");
		arrayOfStrings.add("");

		for(String testInput: arrayOfStrings) {
			System.out.println("testInput: " + testInput + " output: " + compressString.compress(testInput));
		}

	}
}