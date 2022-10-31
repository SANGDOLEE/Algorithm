public class Solution {
    public String[] solution(String my_str, int n) {
        String[] answer;
        if(my_str.length()%n==0) answer=new String[my_str.length()/n];
        else answer=new String[my_str.length()/n+1];

        for(int i=0; i<answer.length; i++){
            answer[i]="";
        }
        int k=0;
        for(int i=0; i<my_str.length(); i++){
            answer[k]+=my_str.charAt(i);
            if((i+1)%n==0){
                k++;
            }
        }
        return answer;
    }
}