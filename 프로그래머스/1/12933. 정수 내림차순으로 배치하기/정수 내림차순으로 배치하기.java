import java.util.ArrayList;
import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;

        List<Integer> list = new ArrayList<>();
        for(char x:String.valueOf(n).toCharArray()){
            list.add(Character.getNumericValue(x));
        }
        Collections.sort(list);
        Collections.reverse(list);
        String temp="";
        for(int i=0; i<list.size(); i++) temp+=String.valueOf(list.get(i));
        answer = Long.parseLong(temp);
        return answer;
    }

}

