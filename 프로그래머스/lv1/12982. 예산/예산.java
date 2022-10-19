import java.util.Arrays;
import java.util.Scanner;
class Solution {
    public int solution(int[] d, int budget) {
       int answer=0;
       Arrays.sort(d); // 1 2 3 4 5
        for(int i=0; i<d.length; i++) {
            if (budget - d[i] >= 0) {
                budget=budget-d[i];
                answer++;
            }
        }
      return answer;
    }
}