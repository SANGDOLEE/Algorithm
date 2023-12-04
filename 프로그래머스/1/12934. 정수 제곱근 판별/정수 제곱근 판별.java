class Solution {
    public long solution(long n) {
        double answer = 0;
        
        double sqrtValue = Math.sqrt(n);
        if (sqrtValue % 1 == 0.0){
            answer = Math.pow(sqrtValue+1.0, 2);
        } else {
            return -1;
        }
        return (long)answer;
    }
}