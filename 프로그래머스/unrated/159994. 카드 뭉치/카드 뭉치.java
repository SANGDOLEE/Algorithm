class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "No";
        int lt = 0; // cards1 index
        int rt = 0; // cards2 index 
        for(int md=0; md<goal.length; md++ ){
            if(lt<cards1.length && goal[md].equals(cards1[lt])) lt++;
            else if(rt<cards2.length && goal[md].equals(cards2[rt])) rt++;
            else return answer;
        }
        answer = "Yes";
        return answer;
    }
}