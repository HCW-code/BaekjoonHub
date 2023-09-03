import java.util.*;
class Solution {
    static int count = 0;
    static Set<String> s = new HashSet<>();
    
    public void dfs(int count, String[] user_id, String[] banned_id, int[] visited, int[] temp){
        
        if(count == banned_id.length){
            int[] t = temp.clone();
            Arrays.sort(t);
            s.add(Arrays.toString(t));
            
        }else{
            for(int i =0 ; i< user_id.length; i++){
                //방문하지 않았고 길이가 같다면
                if(visited[i] == 0 && banned_id[count].length() == user_id[i].length()){
                    //전부다 같다면
                    boolean flag = true;
 
                    for(int j = 0; j < banned_id[count].length(); j++){
                        if(banned_id[count].charAt(j) == '*') continue;
                        if(banned_id[count].charAt(j) == user_id[i].charAt(j))continue;
                        else{
                            flag = false;
                            break;
                        }
                    }
                    if(flag){
                        temp[count] = i;
                        visited[i] = 1;
                        dfs(count + 1, user_id, banned_id, visited, temp);
                        visited[i] = 0;
                    }
            }
        }
    }
    }
    
    
    public int solution(String[] user_id, String[] banned_id) {
        
        int[] visited = new int[user_id.length];
        
        int[] temp = new int[banned_id.length];
        dfs(0, user_id, banned_id, visited, temp);
        
        
        return s.size();
    }
}