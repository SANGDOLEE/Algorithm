import java.util.Scanner;
class Solution {
    public String solution(int a, int b) {
        String answer = "";
        // 31 29 31 30 31 30 31 31 30 31 30 31
        String[] week={"SUN","MON","TUE","WED","THU","FRI","SAT"};
        int day=0;

        for(int i=1; i<a; i++){
            if(i==4||i==6||i==9||i==10){
                day+=30;
            }
            else if(i==2){
                day+=29;
            }else
                day+=31;
        }
        day+=b+4;
        answer=week[day%7];
        return answer;
    }
}