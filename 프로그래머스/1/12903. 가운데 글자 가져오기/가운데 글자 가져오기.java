class Solution {
    public String solution(String s) {
        String answer = "";
        int length = s.length()/2; // 4글자면 2

        if (s.length()%2==0){
            answer+=s.charAt(length-1);
            answer+=s.charAt(length);
        } else {
            answer+=s.charAt(length);
        }
        return answer;
    }
}