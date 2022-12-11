public class Solution {
    public int[] solution(int[][] score){
        int n=score.length;
        int[] answer=new int[n];

        for(int i=0; i<answer.length; i++){
            answer[i]=1;
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(score[i][0]+score[i][1]<score[j][0]+score[j][1])
                    answer[i]++;
            }
        }
        return answer;
    }
}