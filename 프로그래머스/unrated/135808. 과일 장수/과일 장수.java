import java.util.*;
class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score);
        int len = score.length/m; // 7/4 = 1 ---> 배열 반복을 이만큼만 할것이다
        int count = 0; // len 될때까지만 반복
        int min = Integer.MAX_VALUE;
        int[] temp = new int[m];
        int index = 0;
        for(int i=score.length-1; i>=0; i--) {
            min = Math.min(min, score[i]);
            temp[index] = score[i];
            index++;
            if (index == m) { // 0 .. 1.. 2.. 3.. 4.. 5.. 6.. :
                answer+=min*m;
                count++;
                index=0;
                temp=new int[m];
                if(count==len) break;
            }
        }
        return answer;
    }
}