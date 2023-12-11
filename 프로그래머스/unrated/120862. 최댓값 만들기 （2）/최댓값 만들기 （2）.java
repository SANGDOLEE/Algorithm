import java.util.*;
class Solution {
    public int solution(int[] numbers) {
            
        
        Arrays.sort(numbers);
        
        if(numbers[numbers.length-1]<=0){
            return numbers[numbers.length-1]*numbers[numbers.length-2]; 
        }
        
        if(numbers[0]>=0) return numbers[numbers.length-1]*numbers[numbers.length-2];
        
        int minusMul = numbers[0] * numbers[1];
        int plusMul = numbers[numbers.length-1] * numbers[numbers.length-2];
        
        return Math.max(minusMul, plusMul);
    }
}