class Solution {
    public String solution(String s, int n) {
          String answer = "";
        
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(Character.isLowerCase(ch)){
                ch = (char)((ch - 'a' + n) % 26 + 'a');
            } // else로 처리하면 공백과 대문자를 같이 처리하게 된다. 
            else if(Character.isUpperCase(ch)){
                ch = (char)((ch - 'A' + n) % 26 + 'A');
            }
            answer += ch;
        }
        return answer;
    }
}