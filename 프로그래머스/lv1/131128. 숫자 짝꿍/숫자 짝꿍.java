import java.util.Arrays;
import java.util.ArrayList;
class Solution {
    public String solution(String X, String Y) {
               String answer = "";
        int[] x_index=new int[10];
        int[] y_index=new int[10];
        for(String x:X.split("")) x_index[Integer.parseInt(x)]++;
        for(String x:Y.split("")) y_index[Integer.parseInt(x)]++;

        StringBuilder sb=new StringBuilder();
        for(int i=9; i>=0; i--){
            while(x_index[i]>0&&y_index[i]>0){
                sb.append(i);
                x_index[i]--;
                y_index[i]--;
            }
        }
        if("".equals(sb.toString())) answer="-1";
        else if("0".equals(sb.toString().substring(0,1))) answer="0";
        else answer=sb.toString();
        return answer;
    }
}