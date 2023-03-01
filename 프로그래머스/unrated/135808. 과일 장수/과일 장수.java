import java.util.*;
class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score);
        int count = 0; // len 될때까지만 반복
        int min = Integer.MAX_VALUE;
        int index = 0;
        for(int i=score.length-1; i>=0; i--) {
            min = Math.min(min, score[i]);
            index++;
            if (index == m) { // 0 .. 1.. 2.. 3.. 4.. 5.. 6.. :
                answer+=min*m;
                count++;
                index=0;
                if(count==score.length/m) break;
            }
        }
        return answer;
    }
}