class Solution {
    public int solution(String s) {
          int answer = 0;

        char start =' ';
        int x_count = 0;
        int y_count = 0;

        for(int i=0; i<s.length(); i++){
            if(x_count == 0 && y_count == 0){
                start = s.charAt(i);
            }
            char ch = s.charAt(i);
            if(ch != start){
                y_count++;
                if(x_count == y_count){
                    answer++;
                    y_count=0;
                    x_count=0;
                }

            } else if(ch == start){
                x_count++;
            }
        }
        if(x_count != 0 || y_count !=0 ) answer++;
        return answer;
    }
}