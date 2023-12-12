class Solution {
    public String solution(int a, int b) {
        
        String[] day = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
        int[] mon = {31,29,31,30,31,30,31,31,30,31,30,31};

        int sum = 0;
        for(int i=0; i<a-1; i++){
            sum += mon[i];
        }
        sum += b;
         int today = (sum%7);
        if (today == 0) return "THU";
        else return day[today-1];
    }
}