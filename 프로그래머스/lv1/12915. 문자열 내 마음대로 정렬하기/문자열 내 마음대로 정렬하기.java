import java.util.ArrayList;
import java.util.Collections;
class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        ArrayList<String> list=new ArrayList<>();
        // ArrayList에 첫 글자 + 해당 문자열 add
        // sub bed car -> usub ebed acar
        // 이렇게 할 경우 첫문자가 같아도 나머지 문자열로 정렬가능
        for(int i=0; i<strings.length; i++){
            list.add(strings[i].charAt(n)+strings[i]);
        }
        Collections.sort(list);
        for(int i=0; i<list.size(); i++){
            // 첫 알파벳 제거하고 answer에 추가
            answer[i]=list.get(i).substring(1);
        }
        return answer;
    }
}