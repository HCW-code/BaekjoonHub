
import java.io.*;
import java.util.*;

public class Main {
	
	
 public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = Arrays.stream(br.readLine().split("")).mapToInt(Integer::parseInt).toArray();
		int[] in = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
				in[arr[i]] += 1;
		}
		

		int max = 1;
		for(int i =0; i< in.length; i++) {
			if(max < in[i]) {
				if(i == 6 || i == 9) {
					if((in[6] + in[9])%2 == 0) {
						max = (in[6] + in[9])/2;
					}else {
						max = (in[6] + in[9])/2 + 1;
					}
				}else {
					max = in[i];
				}
				
			}
			
		}
		
		System.out.print(max);
	}
}
