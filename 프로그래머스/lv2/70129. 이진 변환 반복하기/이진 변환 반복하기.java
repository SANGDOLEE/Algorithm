class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];

        int cnt = 0;
        int zeroCount = 0;

        while(s.length()>1){
            int s_length = s.length();
            s=s.replaceAll("0","");
            zeroCount += s_length-s.length();

            String x = Integer.toBinaryString(s.length());
            cnt++;
            s=x;
        }

        answer[0]=cnt;
        answer[1]=zeroCount;
        return answer;
    }
}