
public class BinSearch {
	public static int BSearchIter(int[] arr, int n) {
		int left = 0;
		int right = arr.length - 1;
		int mid;

		while (left <= right) {
			mid = (left + right) / 2;
			if (arr[mid] < n)
				left = mid + 1;
			else if (arr[mid] > n)
				right = mid - 1;
			else
				return mid;
		}
		return -1;

	}

	public static int BsearchRec(int[] arr, int n, int left, int right) {
		if (left > right)
			return -1;

		int mid = (left + right) / 2;

		if (arr[mid] < n)
			return BsearchRec(arr, n, mid + 1, right);
		else if (arr[mid] > n)
			return BsearchRec(arr, n, left, mid - 1);
		else
			return mid;
	}
	
	public static void main(String[] args) {
		int []arr =  { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 }; 
		
		int in = 10;
		
		System.out.println("찾을 값은: " + in);
		
		int index  = BSearchIter(arr, in);
		
		if(index <0) 
			System.out.println("해당되는 값을 찾을 수 없음: " + in);
		else
			System.out.println("배열의 index 값은 : " + arr[index]);
		
		int index2 = BsearchRec(arr, in, 0, 10);
		
		if(index <0) 
			System.out.println("해당되는 값을 찾을 수 없음: " + in);
		else
			System.out.println("배열의 index2 값은 : " + arr[index2]);
				
	}
}
