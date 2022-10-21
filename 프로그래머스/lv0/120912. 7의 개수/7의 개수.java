import java.util.Scanner;
class Solution {
    public int solution(int[] array) {
        int answer = 0;
        String s="";
        for(int i=0; i<array.length; i++){
            s+=array[i];
        }
        for(char x:s.toCharArray()){
            if(x=='7')
                answer++;
        }

        return answer;
    }
}