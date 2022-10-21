import java.util.Scanner;
class Solution {
    public int solution(int n) {
        int answer = 0;
        String result="";
        while(n>0){
            result=n%3+result;
            n/=3;
        }
        StringBuilder sb=new StringBuilder(result);
        result=sb.reverse().toString();
        answer=Integer.parseInt(result,3);
        return answer;

    }
}