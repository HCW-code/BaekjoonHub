import java.util.*;
class Solution
{
    public int solution(String s)
    {
        int answer = 0;
        Stack<Character> stack = new Stack<>();
        
        for(int i =0;i < s.length(); i++){
            if(stack.size() == 0){
                stack.push(s.charAt(i));
                continue;
            }
            
            if(stack.peek() == s.charAt(i)){
                stack.pop();
                continue;
            }
            
             stack.push(s.charAt(i));
        }

        return stack.size() == 0 ? 1 : 0;
    }
}