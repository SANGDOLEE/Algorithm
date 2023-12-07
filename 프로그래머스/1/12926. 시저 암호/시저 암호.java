class Solution {
    public String solution(String s, int n) {
                String answer = "";

        for(char ch: s.toCharArray()){
            int ask = 0;
            if(Character.isUpperCase(ch)) {
                ask = (int)ch + n;
                if (ask>90) ask -= 26;

                answer += (char)ask;
            } else if(Character.isLowerCase(ch)) {
                ask = (int)ch + n;
                if (ask > 122) ask -= 26;
                answer += (char)ask;
            } else { // 공백일경우
                answer += " ";
            }
        }
        return answer;
    }
}