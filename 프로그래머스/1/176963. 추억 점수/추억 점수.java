import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
           int[] answer = new int[photo.length];

            HashMap<String, Integer> map = new HashMap<>();

            for(int i=0; i<name.length; i++){
                map.put(name[i], yearning[i]);
            }

            int sum = 0;
            String temp = "";
            int add = 0;
            for(int i=0; i<photo.length; i++){
                for(int j=0; j<photo[i].length; j++){
                    temp = photo[i][j];
                    if(map.containsKey(temp)) {
                        add += map.get(temp);
                    }
                }
                answer[i] = add;
                add=0;
            }

            return answer;
    }
}