import java.util.Scanner;
class Solution {
    public int solution(int num, int k) {
        int answer = 1;
        String m=String.valueOf(k);
        String s=String.valueOf(num);
        String[] str=s.split("");
        for(int i=0; i<str.length; i++){
            if(str[i].equals(m)){
                return answer;
            }else
                answer++;
        }
        if(answer==str.length+1) return -1;
        return answer;
    }
}