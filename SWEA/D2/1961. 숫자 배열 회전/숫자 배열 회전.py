import java.util.Scanner;
import java.util.Arrays;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			int count = sc.nextInt();
			int[][] arr = new int[count][count];
			int[][] arr1 = new int[count][count];
			int[][] arr2 = new int[count][count];
			int[][] arr3 = new int[count][count];
			for (int i = 0; i < count; i++) {
				for (int j = 0; j < count; j++) {
					arr[i][j] = sc.nextInt();

				}
			}

			for (int i = 0; i < count; i++) {
				for (int j = 0; j < count; j++) {
					arr1[i][j] = arr[count - j - 1][i];
				}
			}

			for (int i = 0; i < count; i++) {
				for (int j = 0; j < count; j++) {
					arr2[i][j] = arr1[count - j - 1][i];

				}
			}

			for (int i = 0; i < count; i++) {
				for (int j = 0; j < count; j++) {
					arr3[i][j] = arr2[count - j - 1][i];

				}
			}
			System.out.println("#"+test_case);

			for (int i = 0; i < count; i++) {
				for (int j = 0; j < count; j++) {
					System.out.print(arr1[i][j]);
				}
				System.out.print(" ");
				for (int j = 0; j < count; j++) {
					System.out.print(arr2[i][j]);
				}
				System.out.print(" ");
				for (int j = 0; j < count; j++) {
					System.out.print(arr3[i][j]);
				}
				System.out.println("");
			}

		}
		sc.close();
	}

}
