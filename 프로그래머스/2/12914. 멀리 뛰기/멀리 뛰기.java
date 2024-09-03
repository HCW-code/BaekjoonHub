class Solution {
    public long solution(int n) {
        long answer = 0;
        int[] arr = new int[n+1];
        arr[0] = 0;
        arr[1] = 1;
        if(n >= 2){
            arr[2] = 2;
        }
        
        for(int i = 3;i < n+1; i++){
            arr[i] = (arr[i-1] + arr[i-2]) % 1234567;
        }
        
        
        return  arr[n] % 1234567;
    }
}