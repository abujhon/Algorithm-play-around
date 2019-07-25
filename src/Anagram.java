/**
 * 
 */
package com.enterprises.project;

import java.util.Arrays;

/**
 * @author abuduhelilim2
 *
 */
public class Anagram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String one = "cinema";
		String two = "icemtn";
		
		if (areAnagram(one, two)) {
			System.out.println("The Strings are anagram.");
		}else {
			System.out.println("The Strings are not anagram.");
		}
	}
	
	
	static boolean areAnagram(String str1, String str2) {
		
		
		//find out the length
		int st1 = str1.length();
		int st2 = str2.length();
		
		boolean flag = false;
		
		if (st1 != st2) {
			flag = false;
		}else {
			
		
		char[] charSt1 = str1.toCharArray();
		char[] charSt2 = str2.toCharArray();
		
		Arrays.sort(charSt1);
		Arrays.sort(charSt2);
		
		for (int i = 0; i < charSt2.length; i++) {
			if (charSt1[i] == charSt2[i]) {
				flag = true;
			}
		}
	}
		return flag;
	}

}
