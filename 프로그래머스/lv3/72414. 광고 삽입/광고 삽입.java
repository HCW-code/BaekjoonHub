import java.util.*;

class Solution {
    public String solution(String play_time, String adv_time, String[] logs) {
        
        String[] arr= play_time.split(":");
        int pt= Integer.parseInt(arr[0])*3600
                +Integer.parseInt(arr[1])*60+Integer.parseInt(arr[2]);
        arr = adv_time.split(":");
        int at= Integer.parseInt(arr[0])*3600
                +Integer.parseInt(arr[1])*60+Integer.parseInt(arr[2]);

        
        // PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        int[] count = new int[pt+1];
        
        for(int i = 0; i< logs.length; i++){
            String[] t = logs[i].split("-");
            String[] temp= t[0].split(":");
        int s = Integer.parseInt(temp[0])*3600
                +Integer.parseInt(temp[1])*60+Integer.parseInt(temp[2]);
        temp= t[1].split(":");
        int e = Integer.parseInt(temp[0])*3600
                +Integer.parseInt(temp[1])*60+Integer.parseInt(temp[2]);

            for(int j = s; j < e; j++){
                count[j]++;
                
            }
        }

        long max = 0;
        long c = 0;
        for(int j = 1; j < at; j++){
               max += count[j];
            }
        
        c = max;
        int time = 0;
        int start = 0;
        int end  = at;
        
        
        while(end != pt){
            c-=count[start];
            c+=count[end];
            
            start++;
            end++;
            if(c > max){
                time = start;
                max = c;
            }
        }
        
        String hh, mm, ss;
        hh= (time/3600)>9? (time/3600)+"":"0"+time/3600;
        time%=3600;
        mm= (time/60)>9? (time/60)+"":"0"+time/60;
        time%=60;
        ss= time>9? time+"":"0"+time;

        String answer = hh+":"+mm+":"+ss;
        return answer;
    }
}