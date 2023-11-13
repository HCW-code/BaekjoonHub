import java.io.*;
import java.util.*;

public class Main {
//	5 6
//	1
//	5 1 1
//	1 2 2
//	1 3 3
//	2 3 4
//	2 4 5
//	3 4 6
	static class Next implements Comparable<Next>{
		int num;
		int distance;
		public Next(int num, int distance) {
			this.num = num;
			this.distance = distance;
		}
		
		
	    @Override
		public int compareTo(Next obj) {
		    
		    if(this.distance < obj.distance)        return -1;
		    else                            return 1;
		    
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int V = Integer.parseInt(st.nextToken());
		int E = Integer.parseInt(st.nextToken());
		
		int start = Integer.parseInt(br.readLine());
		ArrayList<Next>[] al = new ArrayList[V+1];
		for(int i =0; i < al.length; i++) {
			al[i] = new ArrayList<>();
		}
		
		for(int i =0;i < E; i++) {
			st = new StringTokenizer(br.readLine());
			al[Integer.parseInt(st.nextToken())].add(new Next(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
		}

		PriorityQueue<Next> pq = new PriorityQueue<>((el1, el2) -> {
			return el1.distance - el2.distance;
		});
		
		int[] answer = new int[V+1];
		Arrays.fill(answer, Integer.MAX_VALUE);
		
		answer[start] = 0;
		pq.add(new Next(start, 0));
		
		while(!pq.isEmpty()) {
			Next current = pq.poll();
			
			for(int i =0; i < al[current.num].size(); i++) {
				if(answer[al[current.num].get(i).num] > answer[current.num] + al[current.num].get(i).distance) {
					answer[al[current.num].get(i).num] = answer[current.num] + al[current.num].get(i).distance;
					pq.add(new Next(al[current.num].get(i).num, answer[al[current.num].get(i).num]));
				}
			}
		}
		
		
		StringBuilder sb = new StringBuilder();
		for(int i =1;i < answer.length; i++) {
			if(answer[i] == Integer.MAX_VALUE) {
				sb.append("INF\n");
			}else {
				sb.append(answer[i] +"\n");
			}
		}
		System.out.println(sb);
		
		
		
		
		
		
	}

}
