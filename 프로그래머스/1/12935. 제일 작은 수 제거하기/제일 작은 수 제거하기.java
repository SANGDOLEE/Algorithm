import java.util.*;
import java.util.Arrays;

import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        if(arr.length == 1){
            answer = new int[1];
            answer[0]= -1;
        } else {
            answer = arr.clone();
            Arrays.sort(arr);
            int min = arr[0];

            answer = removeElement(answer, min);
        }
        return answer;
    }
    public static int[] removeElement(int[] answer, int min){
        return Arrays.stream(answer)
                .filter(i -> i!= min)
                .toArray();
    }

}