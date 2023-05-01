import java.util.Scanner;

public class Armstrong {
	public static void main(String[] args) {
		while (true) {
			int n = 0, k = 0, arm = 0;
			Scanner sc = new Scanner(System.in);

			System.out.print("암스트롱 수인가? : ");
			int s = sc.nextInt();
			k = s;
			do {
				n = k % 10;
				arm += n * n * n;
				k /= 10;
			} while (k != 0);

			System.out.println("결과 : " + arm);

			if (s == arm)
				System.out.println(s + " 는 암스트롱 수이다.");

			else
				System.out.println(s + " 는 암스트롱 수가아니다.");

		}
	}
}
