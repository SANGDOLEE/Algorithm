import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";

            String[] arr = s.split(" ");
            ArrayList<Integer> list = new ArrayList<>();
            for(int i=0; i<arr.length; i++){
                list.add(Integer.valueOf(arr[i]));
            }
            Collections.sort(list);
            int min = list.get(0);
            int max = list.get(list.size()-1);
            answer += min+ " " + max;
            return answer;
    }
}