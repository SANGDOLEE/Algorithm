import java.util.*;
class Solution {
    public int solution(int k, int m, int[] score) {
         int answer = 0;

        Arrays.sort(score);
        int count = score.length / m ;

        int index = 0;
        ArrayList<Integer> list = new ArrayList<>();
        int min = 0;
        for(int i=score.length-1; i>=0; i--) {
            if (list.size() != m) {
                list.add(score[i]);
                min = score[i];
                if( i==0 && list.size() == m){
                    answer += min * m;
                    break;
                }
            } else {
                answer += min * m;
                index++;
                list.clear();
                i++;
            }
            if (index == count ) break;

        }

        return answer;
    }
}