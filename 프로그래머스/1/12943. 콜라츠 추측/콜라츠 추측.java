class Solution {
    public int solution(long num) {
        int answer = 0;

        int count = 0;
        while (count<500) {

            if (num==1){
                break;
            }
            else if (num % 2 == 0) {
                num = num / 2;
            } else {
                num = num * 3 + 1;
            }
            count += 1;
            answer += 1;

        }
        if (num==1) return answer;
        else if (count>=500&&num!=1){
            answer = -1;
        }
        return answer;
    }
}