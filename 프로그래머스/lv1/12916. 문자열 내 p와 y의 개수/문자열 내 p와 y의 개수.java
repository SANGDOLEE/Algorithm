class Solution {
    boolean solution(String s) {
    boolean answer=true;
       int p=0;
       int y=0;
       for(char x:s.toLowerCase().toCharArray()){
           if(x=='p')
               p++;
           else if(x=='y')
               y++;
       }
       if(p==y) return answer;
       else return false;
    }
}