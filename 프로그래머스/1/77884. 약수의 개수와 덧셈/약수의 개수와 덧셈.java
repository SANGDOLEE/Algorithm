import java.util.PriorityQueue;

class Solution {
    public int solution(int left, int right) {
        int answer =0;

        int count = 0;
        for(int i=left; i<=right; i++){
            count = math(i);

            if (count%2==0) answer += i;
            else answer-= i;
        }
        return answer;
    }

    public int math(int num){
        int n=0;
        for(int i=1; i<=num; i++) {
            if (num%i==0) n++;
        }
        return n;
    }
}