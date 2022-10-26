import java.util.Arrays;
class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int num=1;
        int[] temp=emergency.clone();
        Arrays.sort(emergency);
        for(int i=emergency.length-1; i>=0; i--){
            for(int j=0; j<temp.length; j++){
                if(emergency[i]==temp[j]){
                    answer[j]=num;
                    num++;
                }
            }
        }
        return answer;
    }
}