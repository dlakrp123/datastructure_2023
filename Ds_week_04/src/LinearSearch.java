import java.util.Random;

public class LinearSearch {

	static int Linearsearch1(int x[], int key) {
		for (int i = 0; i < x.length; i++) {
			if (x[i] == key)
				return i;
		}
		return (-1);
	}

	public static void main(String[] args) {
		int arr[] = new int [100];
		Random rd = new Random();
		
		for(int i = 0; i<arr.length ; i++) {
			arr[i] = rd.nextInt(100);
		}
		
		System.out.println(Linearsearch1(arr, 10));
	}
}
