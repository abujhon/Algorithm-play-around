
public class BubbleSort {
	
	public static void main(String[] args) {
		
		int[] arr={23,5,2,34,65,22,68,8,42};
		
		// for sorting smaller to big number in the array list
		
		
		for (int i = 0; i < arr.length -1; i++) {
			   for (int j =0; j < arr.length-i-1; j++) {
			    if (arr[j] > arr[j+1]) {
			     int k = arr[j+1];
			     arr[j+1] = arr[j];
			     arr[j] = k;

			    }
			   }
			  }
		for (int i = 0; i < arr.length; i++) {
			
			System.out.print(arr[i]+",");
		}
		
		
		
		
		
		
		
		
		
		
//		int temp;
//		boolean sorted=false;
//		while(sorted=false){
//			sorted=true;
//		
//		for (int i = 0; i < arr.length-1; i++) {
//			
//			if(arr[i]  >  arr[i+1]){
//				//23  >    5
//				temp=arr[i+1];
//				// store 5 to temp
//				arr[i+1] = arr[i];
//				// put 5 to 23 place
//				arr[i]=temp;
//				sorted =false;
//			}
//			
//		}
//		}
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
//	}
//	
//	
	
	
	
	
	
	
	
	// this is for finding the max number in an array list;
	
//	for (int i : arr) {
//		if(max<i){
//			max=i;
//		}
//		
//	}
//	System.out.println("Max number is :"+max);
	
	}
}
