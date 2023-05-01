import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {	
		Scanner input = new Scanner(System.in);
	
		System.out.print("상수 n값을 입력하시오: ");
		
		int ip = input.nextInt(); 
		int sum1 = 0, sum2 = 0;
		
		sum1 = ip*(ip+1)/2;
		
		for(int i = 1; i<=ip;i++) {
			
			sum2 += i;
		}
		
		System.out.println("계산 1의 결과: "+ sum1);
		System.out.println("계산 2의 결과: "+ sum2);
		System.out.println("계산 3의 결과: " + sum3(ip));
	}
	public static int sum3(int c) {
		int sum = 0;
		for(int i = 1; i<=c;i++) {
			for(int j = 0; j<i; j++)
				sum ++;
		}
		return sum;
		
	}
}

