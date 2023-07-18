import java.util.Scanner;

public class Main {
	static int result = 0;
	
	public static void dfs(int sum, int index, int count, int j, int target, int[] arr) {
		if(count == j) {
			if(sum == target) {
				result += 1;
			}
			return;
		}else{
			for(int i = index; i < arr.length; i++) {
				sum+= arr[i];
				dfs(sum, i+1, count+1, j, target, arr);
				sum-=arr[i];
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		int target = sc.nextInt();
		int[] arr = new int[count];

		for (int i = 0; i < count; i++) {
			arr[i] = sc.nextInt();
		}

		for(int j = 1; j <= count; j++) {
			dfs(0, 0, 0, j, target, arr);
		}
		

		System.out.println(result);
	}


}
