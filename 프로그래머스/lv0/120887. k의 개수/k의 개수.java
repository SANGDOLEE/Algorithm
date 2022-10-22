import java.util.Scanner;
class Solution {
    public int solution(int n, int m, int k) {
        int answer=0;
        String s="";
        char c=Character.forDigit(k,10);
        for(int i=n; i<=m; i++) 
            s += String.valueOf(i);
        
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)==c)
                answer++;
        }
        return answer;
    }
}