import java.util.Scanner;
import java.util.Arrays;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			int[][] arr = new int[9][9];
			
			
			for(int i = 0; i < 9; i++) {
				for(int j = 0; j < 9; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			int[] visited_lr = new int[9];
			int[] visited_ud = new int[9];
			boolean flag = false;
			
			for(int i = 0; i < 9; i ++) {
				for(int j = 0; j < 9; j++) {
					if(visited_lr[arr[i][j] - 1] == 0) { // 왼쪽 오른쪽 체크 
						visited_lr[arr[i][j] - 1] = 1;
					}else {
						flag = true;
						break;
					}
					
					if(visited_ud[arr[j][i] - 1] == 0) { // 위아 체크 
						visited_ud[arr[j][i] - 1] = 1;
					}else {
						flag = true;
						break;
					}
				}
				Arrays.fill(visited_lr, 0);
				Arrays.fill(visited_ud, 0);
				
				if(flag) break;
			}
			
			int[] visited_box = new int[9];
			for(int i = 0; i < 9; i=i+3) {
				for(int j = 0; j < 9; j = j+3) {
					Arrays.fill(visited_box, 0);
					for(int k = 0; k < 3; k++) {
						for(int p =0; p < 3; p++) {
							if(visited_box[arr[i+k][j+ p]-1] == 0) {
								visited_box[arr[i+k][j+ p]-1] = 1;
							}else {
								flag = true;
								break;
							}
						}
						if(flag) break;
						
					}
					if(flag) break;
				}
				if(flag) break;
			}
			
			if(flag) {
				System.out.println("#"+ test_case + " "+ 0);
			}else {
				System.out.println("#"+ test_case + " "+ 1);
			}
			
		}
		sc.close();
	}

}
