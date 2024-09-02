import java.util.*;
class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        
        
        for(int i =1;i < brown; i++){
            for(int j =brown - i;j >=1; j--){
                if(2 * (i+j) - 4 == brown){
                    if((i - 2) * (j - 2) == yellow){
                        answer[0] = Math.max(i, j);
                        answer[1] = Math.min(i, j);
                        return answer;
                    }
                }
            }
        }
        
        
        
        
        
        return answer;
    }
}