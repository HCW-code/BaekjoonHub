import java.io.*;
import java.util.*;
public class Main {
	static StringBuilder sb = new StringBuilder();
	
	
	static void dfs(int count, int num, int N, int M, ArrayList<Integer> arr) {
		if(count == M) {
			for(int a : arr) {
				sb.append(a).append(" ");
			}
			sb.append("\n");
			return;
		}else {
			for(int i = num; i <= N; i++) {
					arr.add(i);
					dfs(count+1, i +1, N, M, arr);
					arr.remove(count);
			}
		}
	}
	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken()); 
		

		
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int number = 1;
		dfs(0, number, N, M, arr);

		System.out.println(sb);

	}
	

}
