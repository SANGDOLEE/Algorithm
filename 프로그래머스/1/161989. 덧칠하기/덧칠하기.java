class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;

        int start = section[0];
        answer++;
        for(int temp : section){
            if(start+m> temp){
                continue;
            }
            start = temp;
            answer++;
        }
        return answer;
    }
}