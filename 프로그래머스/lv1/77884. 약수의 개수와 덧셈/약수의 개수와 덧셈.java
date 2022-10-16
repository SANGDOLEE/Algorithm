class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        for(int i=0; i<(right-left+1); i++){
            int num=0;
            for(int j=1; j<=(left+i); j++){
                if((left+i)%j==0){
                    //System.out.println(j);
                    num++;
                }
            }
            if(num%2==0){
                answer+=(left+i);
            }
            else{
                answer-=(left+i);
            }
        }
        return answer;
    }
}

