import java.util.Arrays;
class Solution {
    public int solution(int[] sides) {
        int answer=0;
        Arrays.sort(sides); // 정렬
        //가장 긴변이 이미 나와있는 경우
        //3 6 ->6가장 길떄
        for(int i=0; i<=sides[1]; i++){
            if(i+sides[0]>sides[1])
                answer++;
        }
        //나머지 한변이 가장 긴 경우
        // 3 6 -> 나머지가 가장 길때
        // 6 ; 9;
        for(int i=sides[1]+1; i<sides[0]+sides[1]; i++){
            answer++;
        }

        return answer;
    }
}