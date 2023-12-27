import java.util.*;
class Solution {
    public int solution(int k, int m, int[] score) {
     int answer = 0;

        Arrays.sort(score);

        int index = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=score.length-1; i>=0; i--) {
            index ++;
            if(index == m){
                answer += score[i] * m;
                index = 0;
            }

        }

        return answer;
    }
}