
import java.awt.Point;
import java.io.*;
import java.util.*;

public class Main {
	
	
	static int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1};
	static int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};

	
	
	public static void bfs(int x, int y, int w, int h, int[][] arr) {
		Queue<Point> q = new LinkedList<>();
		q.add(new Point(x, y));
		int x1;
		int y1;
		arr[y][x] = 0;
		while(q.size() != 0) {
			Point p = q.poll();
	        x1= p.x;	//1 출력
	        y1 =p.y;

	        for(int i =0; i< 8; i++) {
	        	if(x1 + dx[i] >= 0 && x1 + dx[i] < w && y1 +dy[i] >=0 && y1+dy[i] < h) {
	        		if(arr[y1+dy[i]][x1+dx[i]] == 1) {
	        			arr[y1+dy[i]][x1+dx[i]] = 0;
	        			q.add(new Point(x1 + dx[i], y1+dy[i]));
	        		}
	        	}
	        }
		}
		return;
	}
	
	

 public static void main(String[] args) throws IOException {
//	 	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 
	 
	 	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
//	 	Scanner sc = new Scanner(System.in);
		while(true) {
			st = new StringTokenizer(br.readLine());
			
//		 	String[] temp = br.readLine().split(" ");
		 	int w = Integer.parseInt(st.nextToken());
		 	int h = Integer.parseInt(st.nextToken());
		 	
		 	if(w == 0 && h == 0) {
		 		break;
		 	}
		 	
//		 	System.out.print(h + " " + w);
		 	int count = 0;
		 	int[][] arr = new int[h][w];
			for(int i = 0; i< h; i++) {
				arr[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			}

			for(int i =0; i < h; i ++) {
				for (int j = 0; j < w; j++) {
					if(arr[i][j] == 1) {
						count++;
//						System.out.println(i +" " + j);
						bfs(j, i, w, h, arr);
					}
				}
			}
			sb.append(count + "\n");
			
		}
		
		System.out.print(sb);
	}
}
