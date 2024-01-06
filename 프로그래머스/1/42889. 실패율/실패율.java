import java.sql.Array;
import java.util.Scanner;
import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];

        int[] temp = new int[N+2]; ; // 1번 index부터 사용할거기때문에
        int total = stages.length;

        for(int stage : stages){
            temp[stage]++;
        }
        float[] failureRate = new float[N+1];
        for(int i=1; i<=N; i++) {
            if(total!=0) {
                failureRate[i]=  (float)temp[i] / total;
                total -= temp[i];
            }
        }
        Integer[] stageOrder = new Integer[N];
        for(int i=0; i<N; i++){
            stageOrder[i] = i+1;
        }
        Arrays.sort(stageOrder, (a,b) -> Float.compare(failureRate[b], failureRate[a]));
       
        for(int i=0; i<N; i++){
            answer[i] = stageOrder[i];
        }


        return answer;
    }
}