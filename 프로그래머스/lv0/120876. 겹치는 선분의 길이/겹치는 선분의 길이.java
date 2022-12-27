import java.util.*;
class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        HashMap<String, Integer> map=new HashMap<>();

        for(int[] line : lines){
            int min=Math.min(line[0],line[1]);
            int max=Math.max(line[0],line[1]);
            for(int i=min; i<max; i++){
                String str=i+"/"+i;
                map.put(str,map.getOrDefault(str,0)+1);
            }
        }
        for(int x:map.values()) {
            if (x >= 2) answer++;
        }
        return answer;
    }
}