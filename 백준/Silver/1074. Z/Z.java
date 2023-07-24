import java.io.*;
import java.util.*;

public class Main {
	static int count = 0;
	
	static void Z(int size, int r, int c) {
		int sqrt = size/4; //16
		int index = (int) Math.sqrt(sqrt); //4
		if(size == 1) {
			return;
		}else {
			if(index <= r && index <= c) {
				count += sqrt*3;
				Z(sqrt, r - index, c - index);
			}else if(index > r && index <= c) {
				count += sqrt;
				Z(sqrt, r, c- index);
			}else if(index <= r && index > c) {
				count += sqrt*2;
				Z(sqrt, r- index, c);
			}else {
				
				Z(sqrt, r, c);
			}
		}
	}
	
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int r = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		
		Z((int)Math.pow((int)Math.pow(2, n), 2), r, c);
		
		System.out.println(count);
	}

}
