class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
         String answer = "Yes";

        int x = 0;
        int y = 0;
        for(int i=0; i<goal.length; i++){
            String temp = goal[i];
            if(temp.equals(cards1[x]) || temp.equals(cards2[y])) {
                if (temp.equals(cards1[x])) {
                    if(x<cards1.length-1) x++;
                } else {
                    if(y<cards2.length-1) y++;
                }
            } else {
                return "No";
            }
        }
        return answer;
    }
}