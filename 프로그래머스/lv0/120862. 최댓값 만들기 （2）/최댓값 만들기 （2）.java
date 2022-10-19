import java.util.Scanner;
class Solution {
    public int solution(int[] numbers) {
        int max=numbers[0]*numbers[1];
        if(numbers.length==2)
            return max;
        for(int i=0; i<numbers.length-1; i++){
            for(int j=i+1; j<numbers.length; j++){
               if(numbers[i]*numbers[j]>max){
                    max=numbers[i]*numbers[j];
                }
            }
        }
        return max;
    }
}