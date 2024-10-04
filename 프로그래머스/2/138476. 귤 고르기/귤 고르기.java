import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        int[] arr = new int[10000001];
        HashMap<String, Integer> hm = new HashMap<>();
        
        for(int i =0; i < tangerine.length; i++){
            arr[tangerine[i]] ++;
        }
        
        Arrays.sort(arr);
        int total = 0;
        for(int i = arr.length - 1; i >= 0; i--){
            if(total < k){
                total += arr[i];
                answer++;
            }else{
                break;
            }
        }
        
        
        
        
        
        
        
        return answer;
    }
}