class Solution {
    public String solution(String my_string) {
        String answer = "";

        String temp = "";
        for(char ch : my_string.toCharArray()){
            String a = String.valueOf(ch);
            if (!temp.contains(a)){
                answer+=a;
                temp+=a;
            }
        }
        return answer;
    }
}