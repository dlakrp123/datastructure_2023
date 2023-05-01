
public class MultiArray {
	
	public static void main(String[] args) {
		int[][] arr = {{1,2,3,4,0}, {5,6,7,8,0} , {9,10,11,12,0}, {0,0,0,0,0}};
		
		for (int i = 0 ; i<arr.length ; i++) {
			for (int j = 0 ; j<arr[0].length-1 ; j++) {
				arr[i][arr[0].length-1] += arr[i][j];
			}
		}
		
		for (int i = 0 ; i<arr.length-1 ; i++) {
			for (int j = 0 ; j<arr[0].length ; j++) {
				arr[arr.length-1][j] += arr[i][j];
			}
		}
		
		
		for (int i = 0 ; i<arr.length ; i++) {
			for (int j = 0 ; j<arr[0].length ; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
