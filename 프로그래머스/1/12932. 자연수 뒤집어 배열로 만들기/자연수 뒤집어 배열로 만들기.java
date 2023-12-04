import java.util.ArrayList;
import java.util.Collections;
import java.util.Queue;
import java.util.Stack;

class Solution {
    public int[] solution(long n) {
        ArrayList<Integer> list = new ArrayList<>();

        String s = String.valueOf(n);
        for(char x:s.toCharArray()){
            list.add(Character.getNumericValue(x));
        }
        Collections.reverse(list);
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i]=list.get(i);
        }
        return answer;
    }
}