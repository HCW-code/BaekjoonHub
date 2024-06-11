class Solution {
    boolean solution(String s) {
        String lows = s.toLowerCase();
        int answer = 0;
        for(int i = 0; i < lows.length(); i++){
            if(lows.charAt(i) == 'p'){
                answer++;
            }else if(lows.charAt(i) == 'y'){
                answer--;
            }
        }


        return answer == 0;
    }
}