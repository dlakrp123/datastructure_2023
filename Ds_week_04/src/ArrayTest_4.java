
public class ArrayTest_4 {
	
	static void InsertArray(int[]a,int r,int n) {
		
		for(int i = a.length-2 ; i>=r ; i--) {
			a[i+1] = a[i];
		}
		a[r] = n;
		for(int i = 0;  i < a.length ; i ++)
			System.out.print(a[i] + " ");
		
	}
	
	public static void main(String[] args) {
		int arr[] = {6,3,1,9,7,2,4};
		
		InsertArray(arr, 3, 5);
	}
}
