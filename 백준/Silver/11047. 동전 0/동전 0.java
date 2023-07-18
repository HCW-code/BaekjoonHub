import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		int K = sc.nextInt();
		
		int[] arr = new int[count];
		for(int i = 0; i < count; i++) {
			arr[i] = sc.nextInt();
		}
		
		int result = 0;
		for(int i = count-1; i >= 0; i--) {
			if(arr[i] <= K) {
				result += K/arr[i];
				K = K%arr[i];
			}
		}
		
		System.out.println(result);

		sc.close();
	}

}
