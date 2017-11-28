package codeChallenge;


import java.util.BitSet;

public class ArrayNumbePick {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 6, 7, 8, 9, 10 };
		
		
		int [] bigArr = {1,3,4,5,6,8,9,10,12,14,15,16,17,18,20};

		System.out.println("Missing number is: "+ArrayNumbePick.pickTheMissing(arr, arr.length));
		
		ArrayNumbePick.missingNumber(arr);
		ArrayNumbePick.missingNumber(bigArr);
		ArrayNumbePick.missedOne(arr);
	}

	/*
	 * given an array in a sequence 1 to 10 pick the number which is not present
	 * in the array
	 */
	
	public static void missedOne(int [] number){
		for (int i = 0; i < number.length-1; i++) {
			if ((number[i] + 1) != number[i+1]){
				System.out.println("missed one is "+ (number[i+1] - 1));
			}
		}
	}
	
	public static void missingNumber(int[] number){
		for (int i = 0; i < number.length -1; i++) {
			int j = i+1;
			int difference = number[j] - number[i] ;
			if(difference != 1){
			int missing_num = number[i] + 1;
			for (int k = difference; k > 1 ; k--) {
			System.out.println("Missing Number is " + missing_num);
			missing_num++;
			}
			}
			}
		
	}
	
	public static int pickTheMissing(int[] num, int lengthOfArray) {
		// 2,3,4,5,6,9,10

		// for (int i = 0; i < num.length-1; i++) {
		// if((num[i]+num[i+1])/2 !=1){
		// System.out.println(num[i]);
		// }
		// }

		int expectedSum = lengthOfArray * ((lengthOfArray + 1) / 2);
		int actualSum = 0;
		for (int i : num) {
			actualSum += i;
		}
		return actualSum - expectedSum;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	private static void printMissingNumber(int[] numbers, int count) {
		int missingCount = count - numbers.length;
		BitSet bitSet = new BitSet(count);
		for (int number : numbers) {
			bitSet.set(number - 1);
		}
//		System.out.printf( Arrays.toString(numbers));
		
		int lastMissingIndex = 0;
		for (int i = 0; i < missingCount; i++) {
			lastMissingIndex = bitSet.nextClearBit(lastMissingIndex);
			System.out.println(++lastMissingIndex);
		}

	}

}
