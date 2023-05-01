
public class Gugu2 {
	public static void main(String[] args) {
		for (int a = 1; a <= 9; a++) {
			System.out.println("구구단 "+a+" 단");
			for (int b = 1; b <= 9; b++) {
				int result = a * b;
				System.out.print(result+" ");
			}
			System.out.println();
		}
	}

}
