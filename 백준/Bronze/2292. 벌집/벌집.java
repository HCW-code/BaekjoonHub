import java.io.*;
import java.util.*;

public class Main {
 public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		if(N == 1) {
			System.out.println(1);
		}else {
			int now = 1;
			int level = 0;
			while(now < N) {
				now += 6*level;
				level++;			
			}
			System.out.println(level);
		}
	}
}
