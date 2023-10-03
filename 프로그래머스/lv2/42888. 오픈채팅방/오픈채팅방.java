import java.util.*;

class Solution {
    public class User{
        String uid;
        String name;
        public User(String uid,String name){
            this.uid = uid;
            this.name = name;
        }
    }
    public ArrayList<String> solution(String[] record) {
        ArrayList<String> answer = new ArrayList<>();
        String[] temp;
        
        HashMap<String, String> hm = new HashMap<>();
        
        for(int i = 0; i< record.length; i++){
            temp = record[i].split(" ");
            if(temp[0].equals("Enter")){
                hm.put(temp[1], temp[2]);
            }else if(temp[0].equals("Change")){
                hm.put(temp[1], temp[2]);
            }
        }
        
        for(int i = 0; i< record.length; i++){
            temp = record[i].split(" ");
            if(temp[0].equals("Enter")){
                answer.add(hm.get(temp[1]) + "님이 들어왔습니다.");
            }else if(temp[0].equals("Leave")){
                answer.add(hm.get(temp[1]) + "님이 나갔습니다.");
            }
        }
        
        
        
        return answer;
    }
}