class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] ch=my_string.toCharArray();
        for(char x:ch){
            if(!answer.contains(String.valueOf(x))) answer+=x;
        }
        return answer;
    }
}