
public class Sum {
	public static void main(String[] args) {
		int sum = 0;
		int n;
		long startTime, endTime, diff1, diff2;
		
		n = 5000000;
		startTime = System.currentTimeMillis();
		sum = n*(n-1)/2;
		endTime = System.currentTimeMillis();
		
		diff1 = endTime - startTime;
		
		System.out.println("실행시간: " + diff1);
		System.out.println("0. Time Differnce = " + diff1);
		
		sum = 0;
		startTime = System.currentTimeMillis();
		for(int i = 0; i<n;i++) {
			sum = sum + i;
		}
		endTime = System.currentTimeMillis();
		diff2 = endTime - startTime;
		
		System.out.println("실행시간: " + diff2);
		System.out.println("0. Time Differnce = " + diff2);
		
		}
}
