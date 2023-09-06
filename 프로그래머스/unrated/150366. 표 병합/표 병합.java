import java.util.*;
import java.util.List;
import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Solution {
	static Point[][] p = new Point[51][51];

	private static void make() {
		for (int i = 1; i < 51; i++) {
			for (int j = 1; j < 51; j++) {
				p[i][j] = new Point(j, i); // x , y로 넣어줌 초기화
			}
		}
	}

	private static Point find(int r, int c) {
		Point t = p[r][c]; 
		int tx = t.x;
		int ty = t.y;

		if (ty == r && tx == c) { //같다면 부모 노드
			return t;
		} else { //아니라면 수정하면서 find 계속 이어감
            
			return p[r][c] = find(ty, tx);
		}
	}

	private static boolean union(int r, int c, int r1, int c1) {
		Point t = find(r, c);
		Point t1 = find(r1, c1);

		if (t.x == t1.x && t.y == t1.y) { //같다면 부모가 같다는 뜻
			return false;
		} else {
            p[r1][c1] = t;
			p[t1.y][t1.x] = t; //아니라면 t1의 부모 t의 부모로 만들어준다.
			return true;
		}
	}

	public static LinkedList<String> solution(String[] commands) {
		LinkedList<String> answer = new LinkedList<>();

		String[][] arr = new String[51][51];
		//초기화
		for (int r = 1; r < 51; r++) {
			for (int c = 1; c < 51; c++) {
				arr[r][c] = "EMPTY";
			}
		}
		//초기화
		make();
		for (int i = 0; i < commands.length; i++) {
			String[] com = commands[i].split(" ");
			if (com[0].equals("UPDATE")) { // update
				if (com.length == 4) { // 직접 값 입력
					int r = Integer.parseInt(com[1]);
					int c = Integer.parseInt(com[2]);
					Point t = find(r, c);
					arr[t.y][t.x] = com[3]; //현 좌표의 루트 좌표로 접근하여 고쳐줌
				} else if (com.length == 3) { // 값을 변경한다.
					for (int r = 1; r < 51; r++) {
						for (int c = 1; c < 51; c++) {
							if (arr[r][c].equals(com[1])) {
								arr[r][c] = com[2];
							}
						}
					}
				}
			} else if (com[0].equals("MERGE")) { // merge
                Point c = find(Integer.parseInt(com[1]), Integer.parseInt(com[2]));
                
                if(arr[c.y][c.x].equals("EMPTY")){
                    union(Integer.parseInt(com[3]),Integer.parseInt(com[4]),Integer.parseInt(com[1]), Integer.parseInt(com[2]));
                }else{
                    union(Integer.parseInt(com[1]), Integer.parseInt(com[2]), Integer.parseInt(com[3]), Integer.parseInt(com[4]));
                }
				
			} else if (com[0].equals("UNMERGE")) { // unmerge
				LinkedList<Point> list = new LinkedList<>();
				Point ct = find(Integer.parseInt(com[1]), Integer.parseInt(com[2])); // 부모를 우선 찾음
				arr[Integer.parseInt(com[1])][Integer.parseInt(com[2])] = arr[ct.y][ct.x]; // 현재 꼭대기에 있는 값 넣어줌
				
				for (int r = 1; r < 51; r++) {
					for (int c = 1; c < 51; c++) {
						Point t = find(r, c); // 루트의 point 가져옴

						if (t.x == ct.x && t.y == ct.y) { // 같다면 셀이 병합되어있다는 뜻
							if (r == Integer.parseInt(com[1]) && c == Integer.parseInt(com[2]))//자기 자신은 list에서 제외해야함
								continue;
							else
								list.add(new Point(c, r)); // 병합되어 있는 곳 좌표
						}
					}
				}

				for (int j = 0; j < list.size(); j++) {
					Point temp = list.get(j);
					p[temp.y][temp.x] = new Point(temp.x, temp.y); // 제자리 포인터를 넣어준다.
					arr[temp.y][temp.x] = "EMPTY"; // 현재에는 EMPTY를 넣어준다.
				}
				p[Integer.parseInt(com[1])][Integer.parseInt(com[2])] = new Point(Integer.parseInt(com[2]),Integer.parseInt(com[1])); //루트를 자기 자신으로 바꿔줌
				
			} else if (com[0].equals("PRINT")) { // print 할 때 자기가 가리키고 있는 곳 좌표의 값을 출력해야함
				Point tt = find(Integer.parseInt(com[1]), Integer.parseInt(com[2]));
				answer.add(arr[tt.y][tt.x]);
			}
			
			
			
			
			//출력
// 			System.out.println(Arrays.toString(com));

// 			for (int p = 1; p < 5; p++) {
// 				for (int j = 1; j < 5; j++) {
// 					System.out.print(arr[p][j] + " ");
// 				}
// 				System.out.println();
// 			}
// 			System.out.println();
// 			for (int t = 1; t < 5; t++) {
// 				for (int j = 1; j < 5; j++) {
// 					System.out.print(p[t][j] + " ");
// 				}
// 				System.out.println();
// 			}
// 			System.out.println();
		}

// 		for (int i = 1; i < 5; i++) {
// 			for (int j = 1; j < 5; j++) {
// 				System.out.print(arr[i][j] + " ");
// 			}
// 			System.out.println();
// 		}

		return answer;
	}


}