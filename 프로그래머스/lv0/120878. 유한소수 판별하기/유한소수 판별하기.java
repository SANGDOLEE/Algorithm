class Solution {
    public static int gcd(int a, int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
    public int solution(int a, int b) {
        
        int max=gcd(a,b); // max = 최대 공약수
        int num=b/max; // 분모를 최대공약수로 나눈 것

        while(num!=1){
            if(num%2==0) num/=2;
            else if(num%5==0) num/=5;
            else return 2;
        }
        return 1;
    }
}