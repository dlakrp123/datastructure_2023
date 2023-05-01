
public class ArratTest_5 {
	static void deleteArray(int []a, int r) {
		for(int i = r ; i<a.length-1 ; i++) {
			a[i] = a[i+1];
		}
		
		a[a.length-1] = 0;
		
		for(int i = 0 ; i < a.length ; i++) 
			System.out.print(a[i] + " ");
	}
	public static void main(String[] args) {
		int []arr = {2,7,9,5,1,3,6};
		
		deleteArray(arr, 3);
	}
}
