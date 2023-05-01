
public class Fibo {

	static int fibRec(int n) {
		if (n == 0)
			return 0;
		if (n == 1)
			return 1;
		return fibRec(n - 1) + fibRec(n - 2);
	}

	static int fibIter(int n) {
		int fn = 0, f1 = 1, f2 = 0;
		if (n == 0)
			return 0;
		if (n == 1)
			return 1;
		for (int i = 2; i <= n; i++) {
			fn = f1 + f2;
			f2 = f1;
			f1 = fn;
		}
		return fn;
	}

	public static void main(String[] args) {
		int n =10;
		double time1 = System.currentTimeMillis();
		fibIter(n);
		double time2 = System.currentTimeMillis();
		System.out.println((time2 - time1) );
		
		time1 = 0.0; time2 = 0.0;
		
		time1 = System.currentTimeMillis();
		fibRec(n);
		time2 = System.currentTimeMillis();
		System.out.println((time2 - time1) );
	}
}
