class Solution {
    public String solution(String s) {
        String answer = "";
        
        for(int i=0; i<s.length(); i++){
            if(i==0) answer += s.toUpperCase().charAt(i);
            else if(s.charAt(i-1) == ' ') answer += s.toUpperCase().charAt(i);
            else answer += s.toLowerCase().charAt(i);
        }
        return answer;
    }
}