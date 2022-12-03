import java.util.*;
class Solution {
     public int solution(String[] spell, String[] dic) {
        int answer = 2;

        String s="";
        Arrays.sort(spell);
        for(int i=0; i<dic.length; i++) {
            s = dic[i];
            String[] arr=s.split("");
            Arrays.sort(arr);
            if(Arrays.equals(arr, spell)){
                answer=1;
                break;
            }
        }

        return answer;
    }
}