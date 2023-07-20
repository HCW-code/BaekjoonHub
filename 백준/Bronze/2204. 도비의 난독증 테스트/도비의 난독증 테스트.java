import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while(true) {
			int count = Integer.parseInt(br.readLine());

			if(count == 0) {
				break;
			}

			String[] str = new String[count];
			String[] str_low = new String[count];

			for(int i =0; i< count; i++) {
				str[i] = br.readLine();
				str_low[i] = str[i].toLowerCase();
			}
			Arrays.sort(str_low);
			
			for(int i = 0; i < count; i++) {
				if(str[i].toLowerCase().equals(str_low[0])) {
					System.out.println(str[i]);
					break;
				}
			}
		}

	}

}
