class Solution {
    public int solution(int[] number) {
             int answer = 0;
        for(int lt=0; lt<number.length-2; lt++){
            for(int mt=lt+1; mt<number.length-1; mt++){
                for(int rt=mt+1; rt<number.length; rt++){
                    if(number[lt]+number[mt]+number[rt]==0){
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
}