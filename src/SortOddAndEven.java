import java.util.ArrayList;
import java.util.List;

public class SortOddAndEven {

	public void sortOddEven(int[] num) {

		
		// [2,5,6,7,8,10]

		
		int even;

		for (int i = 0; i < num.length - 1; i++) {
			for (int j = 0; j < num.length  - 1; j++) {
				if (num[j] % 2 != 0 && num[j + 1] % 2 == 0) {
					even = num[j + 1];
					num[j + 1] = num[j];
					num[j] = even;
				}
			}
		}
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i]+",");
		}
		System.out.println();

	}

	public static void main(String[] args) {
		SortOddAndEven sort = new SortOddAndEven();
		sort.sortOddEven(new int[] { 9, 5, 6, 7, 15, 8, 3, 65, 45, 34, 87, 33, 22 });
		sort.reverseString("i am at school!");
		
		
	}
	
	public void reverseString(String str){
		
		char [] b = str.toCharArray();
		char c;
		for (int i = 0; i<b.length-1; i++) {
			for (int j = 0; j < b.length-i-1; j++) {
			c=b[j+1];
			b[j+1]=b[j];
			b[j]=c;
			
			}
		}
		
		System.out.println(b);
			
		}
	}


