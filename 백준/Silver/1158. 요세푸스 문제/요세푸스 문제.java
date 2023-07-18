import java.util.*;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		int target = sc.nextInt();
		
		Queue<Integer> q = new LinkedList<>();
		for(int i = 0; i < count; i++) {
			q.add(i+1);
		}
		
		int index = 0;
		System.out.print("<");
		while(q.size() != 0) {
			for(int i = 0; i < target-1; i++) {
				q.add(q.element());
				q.remove();
			}
			
			if(q.size() == 1) {
				System.out.print(q.element()+">");
			}else {
				System.out.print(q.element() + ", ");
			}
			
			q.remove();
			index++;
		}
	}
}
