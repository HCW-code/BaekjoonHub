import java.io.*;
import java.util.StringTokenizer;

public class Main {

    static int N;
    static long[] tree;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        long[] arr = new long[N+1];
        tree = new long[N+1];
        for (int i = 1; i <= N; i++) {
            arr[i] = Long.parseLong(br.readLine());
            update(i, arr[i]);
        }

        for (int i = 0; i < M + K; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            long c = Long.parseLong(st.nextToken());
            if (a == 1) {
                update(b, c - arr[b]);
                arr[b] = c;
            }
            else {
                bw.write(String.valueOf(sum((int)c) - sum(b-1)) + '\n');
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }

    public static void update(int i, long diff) {
        while (i <= N) {
            tree[i] += diff; //인덱스에 추가 
            i += (i & -i); //lsb를 더하면서 포함하는 데이터 인덱스로 
        }
    }

    public static long sum(int i) {
        long res = 0;
        while (i > 0) { //i 가 0이 아닐 때까지 
            res += tree[i]; // 누적 
            i -= (i & -i); //i에서
        }
        return res;
    }
}