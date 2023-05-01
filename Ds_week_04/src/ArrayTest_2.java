
public class ArrayTest_2 {
	
	static void shiftArray(int arr[], int d, int n) {
		int j = n-d;
		int[] temp = new int [d];
		for(int k =0 ; k<d ; k++) {
			temp[k] = arr[j];
			j++;
		}
		for(int i = n-d-1 ; i>=0 ; i--) {
			arr[i+d] = arr[i];
		}
		for(int i = 0;i<d;i++) {
			arr[i] = temp[i];
		}
	}
	
	static void printArray(int arr[], int n) {
		for(int i = 0 ; i<n ; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	public static void main(String[] args) {
		int []arr = {6,3,1,9,7,2};
		int n = arr.length;
		shiftArray(arr, 2, n);
		printArray(arr, n);
	}
}
