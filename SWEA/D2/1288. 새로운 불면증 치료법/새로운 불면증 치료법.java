import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int T = kb.nextInt();
        for (int t = 1; t <= T; t++) {
            int n=kb.nextInt();
            int temp=n;
            // 0 1 2 3 4 5 6 7 8 9
            String answer="";
            while(answer.length()!=10){
                String s=String.valueOf(n);
                String[] arr=s.split("");

                for(int i=0; i<arr.length; i++){
                    if(!answer.contains(arr[i])) {
                        answer += arr[i];
                        if(answer.length()==10)
                            break;
                    }
                }
                if(answer.length()==10)
                    break;
                else
                    n+=temp;
            }
            System.out.println("#"+t+" "+n);
        }
    }
}


