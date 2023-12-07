class Solution {
    public int solution(int[] number) {
        int answer = 0;

        int temp = 0;
        for(int i=0; i<number.length-2; i++){
            for(int j=i+1; j<number.length-1; j++){
                for(int k=j+1; k<number.length; k++){
                    temp = number[i]+number[j]+number[k];
                    if (temp == 0) answer++;
                    temp = 0;
                }
            }
        }
        return answer;
    }
    
}