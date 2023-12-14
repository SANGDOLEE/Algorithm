import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
            Arrays.sort(nums);
            int sum = nums[nums.length-1]+nums[nums.length-2]+nums[nums.length-3];
            int[] prime = new int[sum+1];
            for(int i=2; i<prime.length; i++) {
                if (prime[i] == 0) {
                    for (int j = i+i; j <= sum; j += i) prime[j] = 1;
                }
            }
            int temp = 0;
            for(int i=0; i<nums.length-2; i++) {
                for (int j = i + 1; j < nums.length - 1; j++) {
                    for (int k = j+1; k < nums.length; k++) {
                        temp = nums[i] + nums[j] + nums[k];
                        if (prime[temp] == 0) answer++;
                    }
                }
            }
            return answer;
    }
}