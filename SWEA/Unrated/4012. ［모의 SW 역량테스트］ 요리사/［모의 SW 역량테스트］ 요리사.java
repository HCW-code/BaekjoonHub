import java.io.*;
import java.util.*;
 
public class Solution {
 
    static int n;
    static int[][] arr;
    static int min;
 
    static void calculateSum(int[] mask) {
        int sum1 = 0;
        int sum2 = 0;
         
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if(mask[i] == 1 && mask[j] == 1) {
                    sum1 += (arr[i][j] + arr[j][i]);
                }else if(mask[i] == 0 && mask[j] == 0) {
                    sum2 += (arr[i][j] + arr[j][i]);
                }
            }
        }
         
        if (min > Math.abs(sum2 - sum1)) {
            min = Math.abs(sum2 - sum1);
        }
 
 
    }
 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
 
        int T = Integer.parseInt(st.nextToken());
 
        for (int t = 1; t <= T; t++) {
            min = Integer.MAX_VALUE;
            st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            arr = new int[n][n];
 
            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < n; j++) {
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }
             
            int[] mask = new int[n];
            for(int i =n/2; i < n; i++) {
                mask[i] = 1;
            }
            int p =1;
            for(int i = n; i > 0; i--) {
            	if(i <= n/2) p /= i;
                else p *= i;
            }
//            System.out.print(p);
            calculateSum(mask);
            for(int i =0; i< (p/2)-1; i++) {
            	nextPermutation(mask);
            	calculateSum(mask);
            }
            System.out.println("#" + t + " " + min);
        }
    }
 
    private static boolean nextPermutation(int[] set) {
 
        int i = set.length - 1;
        while (i > 0 && set[i - 1] >= set[i]) --i;
 
        if (i == 0)
            return false;
 
        int j = set.length - 1;
        while (set[i - 1] >= set[j])
            --j;
 
        swap(set, i - 1, j);
 
        int k = set.length - 1;
        while (i < k) {
            swap(set, i++, k--);
        }
 
        return true;
    }
 
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
 
    static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }
}