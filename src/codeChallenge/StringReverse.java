package codeChallenge;

public class StringReverse {

	public static void main(String[] args) {
		String input = "My Name Is Abu";
		System.out.println(reverse(input));
		System.out.println(differentWay(input));
		System.out.println(reversedChars(input));

	}

	public static String reverse(String input) {
		String reversed = "";
		if (input.isEmpty() || input == null) {
			System.out.println(" Empty or null string is not accepted!");
		}

		if (input.length() <= 1) {
			reversed = input;
		} else {
			String[] array = input.split(" ");
			for (String str : array) {
				reversed = str + " " + reversed;
			}
		}

		return reversed;
	}

	public static String differentWay(String input) {
		String reversed = "";
		if (input.isEmpty() || input == null) {
			System.out.println(" Empty or null string is not accepted!");
		}

		if (input.length() <= 1) {
			reversed = input;
		} else {
			String[] array = input.split(" ");
			for (int i = 0; i < array.length; i++) {
				reversed = array[i] + " " + reversed;
			}
		}
		return reversed;
	}

	public static String reversedChars(String input) {
		String chars = "";
		if (input.isEmpty() || input == null) {
			System.out.println(" Empty or null string is not accepted!");
		}
		if (input.length() <= 1) {
			chars = input;
		} else {
			
			for (int i = input.length()-1; i >= 0; i--) {
				chars += input.charAt(i);
			}
		
		}

		return chars;
	}

}
