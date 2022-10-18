import java.util.ArrayList;
import java.util.*;
class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";

        ArrayList<Character> list=new ArrayList<>();
        for(char x:my_string.toCharArray()){
            list.add(x);
        }
        for(int i=0; i<list.size(); i++){
            if(i==num1){
                answer+=list.get(num2);
            }else if(i==num2){
               answer+=list.get(num1);
            }else
                answer+=list.get(i);
        }

        return answer;
    }
}