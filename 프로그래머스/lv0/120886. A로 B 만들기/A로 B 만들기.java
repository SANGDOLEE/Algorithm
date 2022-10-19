import java.util.*;
class Solution {
    public int solution(String before, String after) {
        int answer = 1;
        HashMap<Character, Integer> map=new HashMap<>();
        for(char x:before.toCharArray()){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        for(char x:after.toCharArray()){
            if(!map.containsKey(x)||map.get(x)==0) return 0;
            map.put(x, map.get(x)-1);
        }
        return answer;
    }
}