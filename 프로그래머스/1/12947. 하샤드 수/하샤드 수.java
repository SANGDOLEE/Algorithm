import java.util.*;

class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        
        int sum = 0;
        for(char ch:String.valueOf(x).toCharArray()){
            sum += ch-48;
        }
        if (x%sum!=0) answer=false;
        return answer;
    }
}