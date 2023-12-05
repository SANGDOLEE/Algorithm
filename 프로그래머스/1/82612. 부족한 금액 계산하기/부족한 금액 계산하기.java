import java.util.ArrayList;

class Solution {
    public long solution(int price, int money, int count) {
        long temp = price;
        long sum = 0;

        for(int i=0; i<count; i++){
            sum += temp;
            temp += price;
        }
        
        return (sum > money) ? sum-money : 0;
    }
}