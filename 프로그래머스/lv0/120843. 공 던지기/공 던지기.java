public class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int cnt=numbers.length;
        for(int i=0; i<k-1; i++){
            answer+=2;
            if(answer==cnt){
                answer=0;
            }else if(answer>cnt){
                answer=1;
            }
        }
        return answer+1;
    }
}