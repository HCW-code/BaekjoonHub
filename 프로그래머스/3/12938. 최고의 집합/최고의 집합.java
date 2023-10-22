class Solution {
    public int[] solution(int n, int s) {
        int[] answer = new int[n];
        int N = n;
        
        for(int i =0; i < N; i++){
            // System.out.println(s + " " + n);
            if(s/n == 0){
                answer = new int[]{-1};
                break;
            }
            answer[i] = s/n;
            s = s - answer[i];
            n--;
        }
        
        
        
        
        
        return answer;
    }
}