import java.io.*;
import java.util.*;
public class Main {
	static StringBuilder sb = new StringBuilder();
	
	
	static void dfs(int count, int N, int M, ArrayList<Integer> arr, int[] visited) {
		if(count == M) {
			for(int a : arr) {
				sb.append(a).append(" ");
			}
			sb.append("\n");
			return;
		}else {
			for(int i = 1; i <= N; i++) {
				if(visited[i-1] == 0) {
					visited[i-1] = 1;
					arr.add(i);
					dfs(count+1, N, M, arr, visited);
					arr.remove(count);
					visited[i-1] = 0;
				}
				
			}
		}
	}
	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken()); 
		
		int[] visited = new int[N];
		
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		dfs(0, N, M, arr, visited);

		System.out.println(sb);

	}
	

}
