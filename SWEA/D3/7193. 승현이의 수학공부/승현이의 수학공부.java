import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int T = kb.nextInt();
        for (int t = 1; t <= T; t++) {
            int n =kb.nextInt();
            String s=kb.next();
            long sum=0;
            for(int i=0; i<s.length(); i++){
                sum+=s.charAt(i)-'0';
            }
            long answer=sum%(n-1);
            System.out.println("#"+t+" "+answer);
        }
    }
}

