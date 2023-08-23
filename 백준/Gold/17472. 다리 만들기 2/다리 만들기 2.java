import java.awt.Point;
import java.io.*;
import java.util.*;

public class Main {
	public static class map {
		public int from_node;
		public int num;
		public int length;

		public map(int from_node, int num, int length) {
			this.from_node = from_node;
			this.num = num;
			this.length = length;
		}
	}
//	7 8
//	0 0 0 0 0 0 1 1
//	1 1 0 0 0 0 1 1
//	1 1 0 0 0 0 0 0
//	1 1 0 0 0 1 1 0
//	0 0 0 0 0 1 1 0
//	0 0 0 0 0 0 0 0
//	1 1 1 1 1 1 1 1
	
	static int count = 1;
	static int[] dx = { 1, 0, -1, 0 };
	static int[] dy = { 0, 1, 0, -1 };
	static int n;
	static int m;
	static int[][] arr;
	static ArrayList<map>[] al;

	private static void setNode(int y, int x) {
		Queue<Point> q = new ArrayDeque<>();
		arr[y][x] = count;
		q.add(new Point(x, y));

		while (!q.isEmpty()) {
			Point c = q.poll();
			int cx = c.x;
			int cy = c.y;

			for (int k = 0; k < 4; k++) {
				if (cx + dx[k] >= 0 && cx + dx[k] < m && cy + dy[k] >= 0 && cy + dy[k] < n
						&& arr[cy + dy[k]][cx + dx[k]] == -1) {
					arr[cy + dy[k]][cx + dx[k]] = count;
					q.add(new Point(cx + dx[k], cy + dy[k]));
				}
			}
		}
	}
	
	private static void left(int y, int x, int num) {
		int count = 1;
		for (int i = 0; x - i >= 0; i++) {
			if (arr[y][x - i] != 0) {
				if (count > 2) {
					map t = new map(num, arr[y][x - i], count - 1);
					boolean flag = true;
					
					for(int j =0; j < al[num].size(); j++) {
						if(t.num == al[num].get(j).num) {
							al[num].get(j).length = Math.min(al[num].get(j).length, t.length);
							flag = false;
							break;
						}
					}
					
					if(flag) {
						al[num].add(t);
					}
				}
				
				break;
			}
			count++;
		}
	}

	private static void right(int y, int x, int num) {
		int count = 1;
		for (int i = 0; x + i < m; i++) {
			if (arr[y][x + i] != 0) {
				if (count > 2) {
					map t = new map(num, arr[y][x + i], count - 1);
					boolean flag = true;
					for(int j =0; j < al[num].size(); j++) {
						if(t.num == al[num].get(j).num) {
							al[num].get(j).length = Math.min(al[num].get(j).length, t.length);
							flag = false;
							break;
						}
					}
					if(flag) {
						al[num].add(t);
					}
				}
				
				break;
			}
			count++;
		}
	}

	private static void up(int y, int x, int num) {
		int count = 1;
		for (int i = 0; y - i >= 0; i++) {
			if (arr[y - i][x] != 0) {
				if (count > 2) {
					map t = new map(num, arr[y-i][x], count - 1);
					boolean flag = true;
					for(int j =0; j < al[num].size(); j++) {
						if(t.num == al[num].get(j).num) {
							al[num].get(j).length = Math.min(al[num].get(j).length, t.length);
							flag = false;
							break;
						}
					}
					if(flag) {
						al[num].add(t);
					}
				}
				
				break;
			}
			count++;
			
		}
	}

	private static void down(int y, int x, int num) {
		int count = 1;
		for (int i = 0; y + i < n; i++) {
			if (arr[y + i][x] != 0) {
				if (count > 2) {
					map t = new map(num, arr[y+i][x], count - 1);
					boolean flag = true;
					for(int j =0; j < al[num].size(); j++) {
						if(t.num == al[num].get(j).num) {
							al[num].get(j).length = Math.min(al[num].get(j).length, t.length);
							flag = false;
							break;
						}
					}
					if(flag) {
						al[num].add(t);
					}
				}
				
				break;
			}
			count++;
			
		}
	}

	private static void getLength(int cy, int cx, int num) {
		for (int k = 0; k < 4; k++) {
			if (cx + dx[k] >= 0 && cx + dx[k] < m && cy + dy[k] >= 0 && cy + dy[k] < n) { //다음이 배열범위 안 일
				if (arr[cy + dy[k]][cx + dx[k]] == 0) { //다음 배열 0일때
					if (k == 0) { //오른쪽 
						right(cy + dy[k], cx + dx[k], num);
					} else if (k == 1) { //아래 
						down(cy + dy[k], cx + dx[k], num);
					} else if (k == 2) { //왼쪽 
						left(cy + dy[k], cx + dx[k], num);
					} else if (k == 3) { //위쪽 
						up(cy + dy[k], cx + dx[k], num);
					}
				}

			}
		}
	}
	static int[] parents;
	
	private static void make() {
		for(int i = 0; i < parents.length; i++) {
			parents[i] = i;
		}
	}
	private static int find(int a) {
		if(parents[a] == a) return a;
		else return parents[a] = find(parents[a]);
	}
	
	private static boolean union(int a, int b) {
		int ar = find(a);
		int br = find(b);
		
		if(ar == br) return false;
		else{
			parents[br] = ar;
			return true;
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());

		arr = new int[n][m];

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < m; j++) {
				int temp = Integer.parseInt(st.nextToken());
				if (temp == 1) {
					arr[i][j] = -1;
				} else {
					arr[i][j] = temp;
				}
			}
		}

		for (int i = 0; i < n; i++) { //섬번호 매기기 
			for (int j = 0; j < m; j++) {
				if (arr[i][j] == -1) {
					setNode(i, j);
					count++;
				}
			}
		}
		
		al = new ArrayList[count];
		
		
		for (int i = 0; i < count; i++) {
			al[i] = new ArrayList<>();
		}
		

		
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (arr[i][j] != 0) {
					getLength(i, j, arr[i][j]);
				}
			}
//			for(int k =0; k < al.length; k++) {
//				for(int p = 0; p < al[k].size(); p++) {
//					System.out.println(al[k].get(p).from_node + " " +al[k].get(p).num + " " + al[k].get(p).length);
//				}
//				System.out.println();
//				
//			}
		}
		
		parents = new int[count];
		make();
		
		ArrayList<map> result = new ArrayList<>();
		
		for(int i =0; i < al.length; i++) {
			for(int j =0; j < al[i].size(); j++) {
				result.add(al[i].get(j));
			}
		}
		
//		for(int i =0;i < result.size(); i++) {
//			System.out.println(result.get(i).from_node + " " +result.get(i).num + " " + result.get(i).length);
//		}
		
		result.sort((el1, el2) -> {
			return el1.length - el2.length;
		});
		
////		
////		for(int i =0;i < result.size(); i++) {
////			System.out.println(result.get(i).from_node + " " +result.get(i).num + " " + result.get(i).length);
////		}
//		
//		System.out.println(Arrays.toString(parents));
		int fin = 0;
		
		for(int i =0; i< result.size(); i++) {
			
//			System.out.println(Arrays.toString(parents));
			if(union(result.get(i).from_node, result.get(i).num)) {
				fin += result.get(i).length;
			}
			
			
		}
		
		boolean f = true;
		int r = find(1);
		for(int a = 2; a < parents.length; a++) {
			if(find(a) != r) {
				f = false;
				break;
			}
		}
		if(f) {
			System.out.println(fin);
		}else {
			System.out.println(-1);
		}
		
//		
//		for (int i = 0; i < al.length; i++) {
//			for (int j = 0; j < al[i].size(); j++) {
//				System.out.println(i + " " + al[i].get(j).num + " " + al[i].get(j).length);
//			}
//
//		}
		
		
		
		

	}

}
