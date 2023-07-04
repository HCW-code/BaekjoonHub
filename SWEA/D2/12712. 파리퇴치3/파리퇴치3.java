import java.util.Scanner;
import java.util.Arrays;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int[][] arr = new int[n][n];
			for(int i = 0; i< n ; i++) {
				for(int j = 0; j < n; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			int max = 0;
			int sum1 = 0;
			int sum2 = 0;
			for(int i = 0; i< n ; i++) {
				for(int j = 0; j < n; j++) {
					sum1 += arr[i][j];
					sum2 += arr[i][j];
					for(int k = 1; k < m; k++) {
						if(j+k < n) {
							sum1+= arr[i][j+k];
						}
						if(j-k >=0) {
							sum1+= arr[i][j-k];
						}
						if(i+k < n) {
							sum1+= arr[i+k][j];
						}
						if(i-k >=0) {
							sum1+= arr[i-k][j];
						}
					}
					
					
					for(int k = 1; k < m; k++) {
						if(j+k < n && i+k < n) {
							sum2+= arr[i+k][j+k];
						}
						if(j-k >=0 && i-k >=0) {
							sum2+= arr[i-k][j-k];
						}
						if(i+k <n && j-k >= 0) {
							sum2+= arr[i+k][j-k];
						}
						if(i-k >=0 && j+k < n) {
							sum2+= arr[i-k][j+k];
						}
					}
					
					if(sum1 > max) {
						max = sum1;
					}
					if(sum2 > max) {
						max = sum2;
					}
					sum2 = 0;
					sum1 = 0;		
				}
			}
			System.out.println("#"+test_case+" "+max);
		}
		sc.close();
	}

}
