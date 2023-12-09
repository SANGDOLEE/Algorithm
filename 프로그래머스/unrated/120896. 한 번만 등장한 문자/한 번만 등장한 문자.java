import java.util.*;
class Solution {
    public String solution(String s) {
                String answer = "";

        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch : s.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
       ArrayList<Character> list = new ArrayList<>();
        for(char ch : map.keySet()){
            Integer value = map.get(ch);
            if(value==1){
                list.add(ch);
            }
        }
        Collections.sort(list);
        for(int i=0; i<list.size(); i++){
            answer += list.get(i);
        }
        return answer;
    }
}