
public class Sum02 {
	public static void main(String[] args) {
		int sum = 0;
		int n;
		long startTime, endTime, diff;
		
		n = 5000000;
		startTime = System.currentTimeMillis();
		for(int i = 0; i<n;i++) {
			for(int j = 0; j<i;j++) {
				sum = sum+1;
			}
		}
		endTime = System.currentTimeMillis();		
		
		diff =  endTime - startTime;
		
		System.out.println("실행시간: " + diff);
	}
	
}

