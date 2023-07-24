import java.io.*;
import java.util.*;


public class Main {

	public static void main(String[] args) throws IOException {

		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		
        // 입력 데이터 읽기
		
		PriorityQueue<Integer> priorityQueueHighest = new PriorityQueue<>(Collections.reverseOrder());
		
		for(int j = 0; j < N; j++) {
			for(int i =0; i < N; i++) {
				priorityQueueHighest.add(scanner.nextInt());
			}
		}
		
        // 입력 데이터 출력
		for(int i = 0; i < N-1; i++) {
			priorityQueueHighest.poll();
		}
		System.out.println(priorityQueueHighest.peek());
	}

}
