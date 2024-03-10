import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public String solution(String X, String Y) {
        String answer = "";

        ArrayList<String> list = new ArrayList<>();
        HashMap<String, Integer> xMap = new HashMap<>();
        HashMap<String, Integer> yMap = new HashMap<>();

        for(String ch : X.split("")) xMap.put(ch, xMap.getOrDefault(ch,0)+1);
        for(String ch : Y.split("")) yMap.put(ch, yMap.getOrDefault(ch, 0)+1);

        for(String ch : xMap.keySet()){
            if(!yMap.containsKey(ch)) continue;
            int count = Math.min(xMap.get(ch), yMap.get(ch));
            for(int i=0; i<count; i++){
                list.add(ch);
            }
        }
        String result = list.stream()
                .sorted(Collections.reverseOrder())
                .collect(Collectors.joining());

        if(result.isEmpty()) return "-1";
        if(result.replaceAll("0", "").isEmpty()) return "0";
        return result;
    }
}