
public class ArrayTest {
	
	static void shiftArray(int[] a) {
		int t = a[a.length - 1];
		for(int i = a.length -2; i >= 0; i--) {
			a[i + 1] = a[i];
		}
		a[0] = t;
		
		for(int i = 0 ; i<a.length ; i++) {
			System.out.print(a[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		
		int[] a = {6, 3, 1, 9, 7, 2};
		
		shiftArray(a);
	}
}
