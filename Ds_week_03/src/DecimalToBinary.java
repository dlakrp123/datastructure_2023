public class DecimalToBinary {
	static void decToBin(int num, int base) {
		if (num > 0) {
			decToBin(num / base, base);
			System.out.print(num % base);
		}
	}

	static void decTobinIter(int n, int b) {
		int arr[] = new int[40];
		int i =0;
		while(n != 0) {
			arr[i] = n%b;
			n /= b;
			i++;
		}
		for(int j = i-1 ; j>=0 ; j--)
			System.out.print(arr[j]);
	}

	public static void main(String[] ar) {
		int decNo = 999999999;
		System.out.print(" 십진수 " + decNo + " 를 이진수로 변환-> ");
		decToBin(decNo, 2);
		System.out.println();
		System.out.print(" 십진수 " + decNo + " 를 이진수로 변환-> ");
		decTobinIter(decNo, 2);
	}
}