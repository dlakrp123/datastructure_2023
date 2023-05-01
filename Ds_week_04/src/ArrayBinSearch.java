import java.util.Arrays;

public class ArrayBinSearch {
	public static void main(String[] args) {
		int intarr[] = {10,20,15,22,35,7,2,27};
		
		Arrays.sort(intarr);
		int intkey = 22;
		
		System.out.println(intkey + " found at index = " + Arrays.binarySearch(intarr, intkey));
	}
}
