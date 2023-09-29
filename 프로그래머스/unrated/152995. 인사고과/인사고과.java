import java.util.*;
class Solution {
    public int solution(int[][] scores) {
        int answer = 1;
        int temp1 = scores[0][0];
        int temp2 = scores[0][1];
        
        Arrays.sort(scores, (el1, el2) -> {
            if(el1[0] == el2[0]){ //평가 점수로 정렬
                return el1[1] - el2[1];
            }
            //근무 태도로 정렬
            return el2[0] - el1[0];
        });
        // for(int i =0 ; i< scores.length; i++){
        //     System.out.println(Arrays.toString(scores[i]));
        // }

        int max = 0;
        for(int[] score : scores) {
            if(score[1] < max) {
                if(temp1 == score[0] && temp2 == score[1])
                    return -1;
            }
            else {
                max = Math.max(score[1], max);
                if(temp1 + temp2 < score[0] + score[1])
                    answer++;
            }
        }

        return answer;
    }
}
