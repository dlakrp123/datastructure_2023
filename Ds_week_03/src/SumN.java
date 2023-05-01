
public class SumN {
	public static int sumRec(int n) {
		if (n ==1)
			return 1;
		int sum = n + sumRec(n-1);
		
		return sum;
	}
	
	public static int sumIter(int n) {
		int sum = 0;
		for(int i = 1;i<=n;i++) {
			sum = sum+i;
			}
		return sum;

	}
	public static void main(String[] args) {
		int n = 4;
		System.out.println(sumRec(n));
		System.out.println(sumIter(n));
	}
	
}
