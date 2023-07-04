import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		for(int test_case = 1; test_case <= T; test_case++)
		{
			int a = sc.nextInt();
			int b = sc.nextInt();
			int[] a_arr = new int[a];
			int[] b_arr = new int[b];
			for(int i = 0; i < a; i++) {
				a_arr[i] = sc.nextInt();
			}
			for(int i = 0; i < b; i++) {
				b_arr[i] = sc.nextInt();
			}

			if(a < b) {
				int loop = b - a;
				int max = 0;
				int sum = 0;
				for(int i = 0; i <= loop; i ++) {
					for(int j = 0; j < a; j++) {
						sum += a_arr[j] * b_arr[j+i];
					}
					if(sum > max) max = sum;
					sum = 0;
				}
				System.out.println("#"+test_case+" "+max);
			}else {
				int loop = a - b;
				int max = 0;
				int sum = 0;
				for(int i = 0; i <= loop; i ++) {
					for(int j = 0; j < b; j++) {
						sum += b_arr[j] * a_arr[j+i];
					}
					if(sum > max) max = sum;
					sum = 0;
				}
				System.out.println("#"+test_case+" "+max);
			}
		}
		sc.close();
	}
}