class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "No";
        int lt = 0;
        int rt = 0;
        for(int md=0; md<goal.length; md++ ){
            if(cards1[lt].equals(goal[md])){
                lt  = (lt< cards1.length-1)? lt+1 : lt;
            } else if (cards2[rt].equals(goal[md])){
                rt = (rt<cards2.length-1)? rt+1 : rt;
            } else {
                return answer;
            }
        }
        answer = "Yes";
        return answer;
    }
}