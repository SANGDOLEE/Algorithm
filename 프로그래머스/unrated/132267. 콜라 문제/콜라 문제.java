class Solution {
    public int solution(int a, int b, int n) {
         int answer = 0;
        int temp = 0;
        // a=3 b=2 n=20
        while (n>=a) {
            temp=(n/a)*b;
            answer+=temp;
            int p=n%a;
            n=temp+p;
        }
        return answer;
    }
}