class Solution {
    public int solution(String my_string) {
        int answer=0;
        String[] s=my_string.split(" ");
        answer=Integer.parseInt(s[0]);
        for(int i=1; i<s.length; i++) {
            if (i % 2 != 0) {// i가 홀수일때만 연산자
                if (s[i].equals("+"))
                    answer += Integer.parseInt(s[i + 1]);
                else
                    answer -= Integer.parseInt(s[i + 1]);
            }
        }
        return answer;
    }
}