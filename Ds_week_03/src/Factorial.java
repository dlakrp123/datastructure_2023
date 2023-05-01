
public class Factorial {

	static int factRec(int n) {
		if (n == 1)
			return 1;
		else return n*factRec(n-1);
	}
	
	static int factIter(int n) {
		int sum = 1;
		for	(int i =1 ;i<=n;i++) {
			sum = sum*i;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		int n=5;
		System.out.println("반복함수: "+factIter(n));
		System.out.println("재귀함수: " + factRec(n));
	}
}
