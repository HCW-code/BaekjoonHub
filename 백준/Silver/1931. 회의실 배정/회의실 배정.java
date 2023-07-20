import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] arr = new int[N][2];
		
		
		for(int i = 0; i < N; i++) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
		}
		
		
		Arrays.sort(arr, (a1, a2) -> {
		    if(a1[1] != a2[1]) {
		    	return a1[1]-a2[1];
		    }else {
		    	return a1[0]-a2[0];
		    }
		});

		int count = 1;
		int last_time = arr[0][1];
		for(int i = 1; i< N; i++) {
			if(arr[i][0]>=last_time) {
				count += 1;
				last_time = arr[i][1];
			}
		}
		
		System.out.println(count);
		sc.close();	
	}
	

}
