import java.util.*;
class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
             int[] answer = new int[2];

        int zero_count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int x : lottos){
            if(x != 0) { // 0이 아니면 넣고
                map.put(x, map.getOrDefault(x, 0) + 1);
            } else { // 0이면 따로 카운팅
                zero_count++;
            }
        }
        for(int y : win_nums){
                map.put(y, map.getOrDefault(y, 0) + 1);
        };

        int correct = 0; // 최저
        for(int value:map.values()) {
            if (value == 2) correct++; // 0을 제외하고 일치한 갯수
        }
       int max = correct + zero_count;
        if(max<2){ // 낙첨
            answer[0] = 6;
            answer[1] = 6;
            return answer;

        }
        int low = correct == 0 ? 6 : 7 - correct;
        int high = 7 - correct - zero_count;
        answer[0]=high;
        answer[1]=low;
        return answer;
    }
}