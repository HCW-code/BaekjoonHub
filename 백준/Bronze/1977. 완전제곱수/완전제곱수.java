
import java.io.*;
import java.util.*;

public class Main {
 public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		int M = sc.nextInt();
		int N = sc.nextInt();
		
		int min = 0;
		int sum = 0;
		for(int i = (int)Math.ceil(Math.sqrt(M)); i <= Math.floor(Math.sqrt(N)); i++){
			if(min == 0) min = i*i;
			sum += (i * i);
		}
		if(min != 0) System.out.println(sum + "\n" + min);
		else  System.out.println(-1);
	}
}
