class Solution {
    public int solution(int chicken) {
            int answer = 0;

        int temp=0;
        while(chicken>=10){
            answer+=chicken/10;
            temp=chicken%10;
            chicken=chicken/10+temp;
        }

        return answer;
    }
}