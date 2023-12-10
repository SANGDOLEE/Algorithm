class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";

            String[] temp = new String[my_string.length()/m];
            int index = 0;

            for(int i=0; i<my_string.length(); i++){
                 temp[index] += my_string.charAt(i);
                 if( (i+1)%m == 0){
                     index++;
                 }

            }
            for(int i=0; i<temp.length; i++){
                answer+=temp[i].charAt(c+3);
            }

            return answer;
    }
}