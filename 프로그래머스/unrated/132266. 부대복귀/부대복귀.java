import java.util.*;
class Solution {
    public class Node{
        int distance;
        int num;
        public Node(int distance, int num){
            this.distance = distance;
            this.num = num;
        }
    }
    public int[] solution(int n, int[][] roads, int[] sources, int destination) {
        int[] answer = new int[sources.length];
        int[] visited = new int[n+1];
        int[] result = new int[n+1];
        ArrayList<Integer>[] al = new ArrayList[n+1];
        for(int i = 1; i < n+1; i++){
            al[i] = new ArrayList<>();
        }
        for(int i = 0; i < roads.length; i++){
            al[roads[i][0]].add(roads[i][1]);
            al[roads[i][1]].add(roads[i][0]);
        }
        
        Queue<Node> q = new LinkedList<>();
        
        visited[destination] = 1;
        q.add(new Node(0, destination));
        
        while(!q.isEmpty()){
            Node temp = q.poll();
            int tempDistance = temp.distance;
            int tempNum = temp.num;
            result[tempNum] = tempDistance;
            
            for(int i = 0; i < al[tempNum].size(); i++){
                if(visited[al[tempNum].get(i)] == 0){
                    visited[al[tempNum].get(i)] = 1;
                    q.add(new Node(tempDistance+1, al[tempNum].get(i)));
                }
            }
        }
        
        
        for(int i = 0; i< sources.length; i++){
            if(result[sources[i]] == 0 && sources[i] != destination){
                answer[i] = -1;
                continue;
            }
            answer[i] = result[sources[i]];
        }
        return answer;
    }
}