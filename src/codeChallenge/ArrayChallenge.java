package codeChallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayChallenge {
	public static void main(String[] args) {
		int [] myArr = {1,6,76,8,9,11};
		int [] myArr2= {4,17,35,15,18,9};
		
		smallestDifference(myArr, myArr2);
		
//		int temp=0;
//		int sub = 0;
//		int sub2 = 0;
//		
//		List<Integer> pair = new ArrayList<>() ;
//		
//		for (int i = 0; i < myArr.length; i++) {
//			for (int j = 0; j < myArr2.length; j++) {
//				
//				if(myArr[i]-myArr2[j]<myArr2[i]-myArr[j+1]){
//					sub=myArr[i];
//					sub2=myArr2[j];
//				}else if(myArr[i]==myArr2[j]){
//					sub=myArr[i];
//					sub2=myArr2[j];
//				}
//				
//		}
//			
//				System.out.println(sub-sub2);
//				pair.add(myArr[i]);
//				pair.add(myArr2[i]);
//			
//			System.out.println(pair);
//		
//	}

}
	
	public static void smallestDifference(int [] arr1, int [] arr2){
		
//		int [] myArr = {1,6,76,8,9,11};
//		int [] myArr2= {4,7,35,15,18,75};
		
		int min =0;
		int min2=0;
		int outp=0;
		int out=0;
		List<Integer> dif1=new ArrayList<>();
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if(arr1[i]-arr2[j] < 0){
					continue;
					
				}else if (arr1[i]-arr2[j] > 0 ){
					
					
					dif1.add(arr1[i]-arr2[j]);
					if (arr1[i]-arr2[j]==1 || arr1[i]-arr2[j] <= 2 || arr1[i]-arr2[j] <= 3 || arr1[i]-arr2[j] <= 4) {
						System.out.println(arr1[i]+","+arr2[j]);
					}
					
				}
				
				
			}
			
		}
		
		System.out.println(dif1);
		
		
//		if(min - min2 > 0 ){
//			outp=min-min2;
//			System.out.println("Smallest Differece is :"+ outp);
//		}else {
//			out= min2-min;
//			System.out.println("Smallest Differece is :"+ out);
//		}
//		List<Integer> output = new ArrayList<>();
//		output.add(min);
//		output.add(min2);
//		System.out.println(output);
	}
	
	
	}


