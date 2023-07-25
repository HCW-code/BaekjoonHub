import java.awt.Point;
import java.io.*;
import java.util.*;
public class Main {
	
	
	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());


		String[][] arr = new String[N][M];
		for(int i = 0; i < N; i++) {
			arr[i] = br.readLine().split("");
		}
		
		int[][] map = new int[N][M];
		for(int i = 0; i < N; i++) {
			map[i] = Arrays.stream(arr[i]).mapToInt(Integer::parseInt).toArray();
		}

		
		int[] dx = {1, -1, 0, 0};
		int[] dy = {0, 0, 1, -1};
		Queue<Point> queue = new LinkedList<Point>();
		queue.add(new Point(0, 0));
		
		while(!queue.isEmpty()) {
			Point p = queue.poll();
			if(p.x == M-1 && p.y == N-1) {
				System.out.println(map[N-1][M-1]);
				break;
			}

			for(int i = 0; i < 4; i++) {
				if(p.x + dx[i] < M && p.x + dx[i]>=0 && p.y +dy[i] < N && p.y+dy[i] >= 0) {
					if(map[p.y + dy[i]][p.x + dx[i]] == 1) {
						map[p.y+dy[i]][p.x + dx[i]] = map[p.y][p.x] + 1;
						queue.add(new Point(p.x + dx[i], p.y+dy[i]));
					}
					
				}
			}
		}
	}
	

}
