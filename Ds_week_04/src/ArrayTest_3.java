
public class ArrayTest_3 {
	static void reverseArray(int a[]) {
		int temp;
		for(int i = 0; i<a.length/2 ; i++) {
			temp = a[i];
			a[i] = a[a.length-i-1];
			a[a.length-i-1] = temp;
		}
		for(int i = 0 ; i<a.length ; i ++)
			System.out.print(a[i] + " ");
	}
	
	public static void main(String[] args) {
		int arr[] = {6,3,1,9,7,2};
		
		reverseArray(arr);
	}
	
}
