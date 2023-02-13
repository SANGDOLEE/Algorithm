class Solution {
    private static int Is_Prime(int num){
        int count = 0;



        for(int i=1; i<=num; i++){
            if(num%i==0) count+=1;
            if(count>=3)
                return count;
        }
        return count;
    }
    public int solution(int[] nums){
        int answer = 0;

        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                for(int k=j+1; k<nums.length; k++){
                    int sum=nums[i]+nums[j]+nums[k];
                    int result = Is_Prime(sum);
                    if(result == 2) answer++;
                }
            }
        }

        return answer;
    }
}