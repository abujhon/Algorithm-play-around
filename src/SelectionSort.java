
public class SelectionSort {
	
	public void selectSort(int[] num){
		
		// 8,4,7,6,2
		
		int temp , minValue , minIndex=0;
		for (int i = 0; i < num.length; i++) {
			minValue=num[i];
			minIndex=i;
			for (int j = 0; j < num.length; j++) {
				if(num[j]<minValue){
					minValue=num[j];
					minIndex=j;
				}
			}
			if(minValue < num[i]){
				temp=num[i];
				num[i]=num[minIndex];
				num[minIndex]=temp;
			}
		}
		
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i]+",");
		}
		
	}
	
	
	public int[] selectionSort (int[] list) {
		int i, j, minValue, minIndex, temp = 0;
		for (i = 0; i < list.length; i++) {
			minValue = list[i];
			minIndex = i;
			for (j = i; j < list.length; j++) {
				if (list[j] < minValue) {
					minValue = list[j];
					minIndex = j;
				}
			}
			if (minValue < list[i]) {
				temp = list[i];
				list[i] = list[minIndex];
				list[minIndex] = temp;
			}
		}
		return list;
	}
	
	

	public static void main(String[] args) {
		SelectionSort sel=new SelectionSort();
		System.out.println(sel.selectionSort(new int[] {8,4,7,6,2,12,1,3,23}));
		sel.selectSort(new int[] {8,4,7,6,2,12,1,3,23});

	}

}
