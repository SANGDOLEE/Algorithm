class Solution {
    public int[] solution(String s) {
       int[] answer = new int[s.length()];

        String temp = "";

        int index;
        for(int i=0; i<s.length(); i++){
            index = temp.lastIndexOf(s.charAt(i));

            if (index == -1) answer[i] = index;
            else answer [i] = i-index;

            temp += s.charAt(i);
        }
        return answer;
    }
}