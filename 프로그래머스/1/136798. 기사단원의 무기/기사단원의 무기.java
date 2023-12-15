class Solution {
    public int solution(int number, int limit, int power) {
          int answer = 0;


        int[] arr = new int[number];
        int temp = 0;

        for(int i=1; i<=number; i++){
            temp = sqrt(i);
            arr[i-1]=temp;
        }
        
        for(int i=0; i<arr.length; i++){
            if(arr[i]<=limit) answer+=arr[i];
            else answer += power;
        }
        
        return answer;
    }
     public int sqrt(int num){
        int cnt = 0;
        for(int i=1; i*i<=num; i++){
            if(i*i==num) cnt++;
            else if(num%i==0) cnt+=2;
        }

        return cnt;
    }
}