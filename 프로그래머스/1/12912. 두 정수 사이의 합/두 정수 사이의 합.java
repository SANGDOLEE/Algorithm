import java.util.*;

class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        
        int[] arr = {a,b};
        Arrays.sort(arr);
        
        int max = arr[1];
        int min = arr[0];
        for(int i=min; i<=max; i++){
            answer += i;
        }
        return answer;
    }
}