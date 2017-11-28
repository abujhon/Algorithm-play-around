package leeCodeAlgorithm;

public class TwoSumTarget {
	
	
	
	public static void main(String[] args) {
		int[] arr = {2,3,4,6};
		int [] twonum = getTarget(arr, 9);
		for (int i : twonum) {
			System.out.println(i);
		}
	}
	
//	Given an array of integers, return indices of the two numbers such that they add up to a specific target.
//  You may assume that each input would have exactly one solution, and you may not use the same element twice.
	
	public static int[] getTarget(int[] nums, int target){ 
		int [] numbers = new int[2];
		int temp;
     	int closest = 0;
		int diff =0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length-1; j++) {
				temp = nums[i] + nums[j+1];
//				diff = target - temp;
//				closest = target - diff;
				if ( temp == target) {
					numbers[0] = nums[i];
					numbers[1] = nums[j+1];
					break;
				} 
//					else{
//					 if(closest - diff > ){
//						 
//						 // save two numbers
//						 numbers[0] = nums[i];
//							numbers[1] = nums[j];
//					 }
//					
//				}
//				else{
//					if(closest > Math.abs(temp - target))
//					closest = temp - target;
//					numbers[0] = nums[i];
//					numbers[1] = nums[j];
//					break;
// 				}
			

			}
		}
		
		
		
		return numbers;
	}

}
