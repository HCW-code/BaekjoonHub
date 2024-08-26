import java.util.*;

class Solution {
    public String solution(String s) {
        
        s = s.toLowerCase();
        boolean check = true;
        StringBuilder sb = new StringBuilder();
        
        for (char c : s.toCharArray()) {
            if (c == ' ') {
                check = true;
            } else if (check) { //공백 후 처음 오는 문자
                c = Character.toUpperCase(c);
                check = false; //그 뒤는 소문자로
            }
            sb.append(c);
        }
                
        return sb.toString();
    }
}