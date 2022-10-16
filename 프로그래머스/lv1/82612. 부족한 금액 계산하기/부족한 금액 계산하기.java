class Solution {
    public long solution(long price, long money, long count) {
        long sum=0;
        for(int i=1; i<=count; i++){ 
           sum+=price*i; 
        }
        if(sum>money)
            return sum-money;
        else
            return 0;
    }
}