/**
 * 
 */
package com.enterprises.project;


/**
 * @author abuduhelilim2
 *
 */
public class FizzerBuzzer {
	
	
	public static void main(String[] args) {
	fizzerBuzzer();
	//anotherWay();
	}
	
	
	
	public static void fizzerBuzzer(){
		
		
		for (int i = 1; i < 100; i++) {
			String output = "";
			if (i % 3 == 0) {
				output = "Fizz";
			}
			if (i % 5 == 0) {
				output = "Buzz";
			}
			
			if (i % 3 == 0 && i % 5 == 0) {
				output = "FizzerBuzzer!";
			}
			
			if (output == "") {
				System.err.println(i);
			}else {
				System.out.println(output);
			}
		}
	}
	
	
	public static void anotherWay() {
		
		for (int i = 1; i < 100 ; i++) {
			if (i % 15 == 0) {
				System.err.println("FizzerBuzzer");
			}else if (i % 3 == 0) {
				System.err.println("Fizz");
			}else if (i % 5 == 0) {
				System.out.println("Buzz");
			}else {
				System.out.println(i);
			}
		}
	}

}
