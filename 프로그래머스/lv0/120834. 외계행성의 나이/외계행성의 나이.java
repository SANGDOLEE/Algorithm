class Solution {
    public String solution(int age) {
        String answer = "";

        String[] alpha={"a","b","c","d","e","f","g","h","i","j"};
        String s=String.valueOf(age);
        for(char x: s.toCharArray()){
            int n=x-'0';
            answer+=alpha[n];
        }
        return answer;
    }
}