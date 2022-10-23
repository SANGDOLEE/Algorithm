class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String s=my_string.replaceAll("[^0-9]","");
        
        for(char ch: s.toCharArray()){
            answer+=Character.getNumericValue(ch);
        }
        return answer;
    }
}