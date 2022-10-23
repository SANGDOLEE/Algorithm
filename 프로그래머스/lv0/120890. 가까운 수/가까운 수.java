import java.util.Arrays;
import java.util.Scanner;
class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int min=Integer.MAX_VALUE;
        Arrays.sort(array);
        for(int i=0; i<array.length; i++){
            // n이 배열의 원소보다 큰경우
            if(n>array[i]){
                if(n-array[i]<min) {
                    min = n - array[i];
                    answer=array[i];
                }
            // 배열의 원소가 n보다 큰경우
            }else{
                if(array[i]-n<min) {
                    min = array[i] - n;
                    answer=array[i];
                }
            }
        }
        return answer;
    }
}