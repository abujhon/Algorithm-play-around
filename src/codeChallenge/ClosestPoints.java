package codeChallenge;

public class ClosestPoints {
	
	public static void main(String[] args) {
		
		int [][] arr= new int [][] {{3,5,1,7,8},{12,31,54,6,9}};
		
		int p1 =0, p2 =1;
		int shortDis = distance(arr[p1][0], arr[p1][1], arr[p2][0], arr[p2][1]);
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				int distance = distance(arr[i][0], arr[i][1], arr[j][0], arr[j][1]);
				if (shortDis > distance) {
					p1=i;
					p2=j;
					shortDis = distance;
				}
			}
		}
		System.out.println("Closest values are : "+ "("+arr[p1][0]+ ","+ arr[p1][1] +") and ("+ arr[p2][0]+"," +arr[p2][1]+")");
	}

	
	
	public static int distance(int x1,int x2,int y1, int y2){
		
		return (int) Math.sqrt((x2-x1)*(x2-x1) + (y2-y1) * (y2-y1));
	}
}
