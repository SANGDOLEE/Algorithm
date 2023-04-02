class Solution {
    public int solution(int n) {
        int answer = 0;

        String temp = Integer.toBinaryString(n);
        int tempCount = temp.length() - temp.replace("1", "").length();

        int num = n+1;
        while(true){
            String num_temp = Integer.toBinaryString(num);
            int num_count = num_temp.length() - num_temp.replace("1","").length();
            if(tempCount == num_count) {
                answer = num;
                break;
            }
            else {
                num++;
            }
        }
        
        return answer;
    }
}