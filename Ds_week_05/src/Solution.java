import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int side = sc.nextInt();
		char alpha = 'A';
		char[][] matrix = new char[side][side];

		for (int i = 0; i < side; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if(alpha >= 'Z')
					alpha = 'A';
				matrix[i][j] = alpha;
				alpha++;
			}
		}
		for (int i = side - 1; i >= 0; i--) {
			for (int j = side - 1; j >= 0; j--) {
				System.out.print(matrix[j][i] + " ");
			}
			System.out.println();
		}
	}
}