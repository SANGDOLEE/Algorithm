class Solution {
    public int gcd(int a, int b){
        if (a%b==0) return b;
        return gcd(b,a%b);
    }
    public int lcm(int a, int b){
        return a*b/gcd(a,b);
    }
    public int[] solution(int denum1, int num1, int denum2, int num2) {
        int[] answer = new int[2];

        int bot =lcm(num1,num2); // 최소 공배수 -> 분모
        int top=((denum1*(bot/num1))+denum2*(bot/num2));

        // 약분이 가능하다면
        int max= gcd(top,bot);
        if(max!=0){
            bot/=max;
            top/=max;
        }
        answer[0]=top;
        answer[1]=bot;
        return answer;
    }
}