package codeChallenge;

import java.util.ArrayList;

public class IntegerSum {

	public static void main(String[] args) {
		
		System.out.println(intParser(8577345));
		
		System.out.println(intSplit(123456));
	
	}
	
	public static int intParser(int num){
		// first i parse the integer to a String so i can split the numbers.
		String temp= Integer.toString(num);
		// then i create an array of integer then store the each chars of string into array 
		int [] number = new int[temp.length()];
		for (int i = 0; i < number.length; i++) {
			
			// the reason - '0' is char 1 has a value of integer 49 in unicode 
			// so we have to make sure it remains in char
			
			number [i] = temp.charAt(i) - '0' ;
		}
		
		// now i got the int array , perform adding each other.
		int num1 = 0;
		for (int i = 0; i < number.length; i++) {
			num1 = num1 + number[i];
		}
		
		return num1;
	}
	
	public static int intSplit(int num){
		int number = 0;
		ArrayList<Integer> num1 = new ArrayList<>();
		String [] temp = Integer.toString(num).split("");
		
		for (int i = 0; i < temp.length; i++) {
			num1.add(Integer.valueOf(temp[i]));
		}
		
		for (int i = 0; i < num1.size(); i++) {
			number = number + num1.get(i);
		}
		return number;
	}

}
