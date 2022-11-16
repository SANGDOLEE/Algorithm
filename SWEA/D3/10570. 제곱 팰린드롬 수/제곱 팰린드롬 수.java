import java.util.Scanner;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int T = kb.nextInt();
            for (int t = 1; t <= T; t++) {
                int a=kb.nextInt();
                int b=kb.nextInt();

                int cnt=0;
                for(int i=a; i<=b; i++){
                    String s=String.valueOf(i);
                    StringBuilder sb=new StringBuilder(s);
                    sb=sb.reverse();
                    if(s.equals(sb.toString())){ // 1번 팰린드롬 확인
                        double temp=Math.sqrt(i);
                        int num=(int)temp;
                        if(num*num==i) {
                            String ss = String.valueOf(num);
                            sb = new StringBuilder(ss).reverse();
                            if (sb.toString().equals(ss))
                                cnt++;
                        }
                    }
                }
                System.out.println("#"+t+" "+cnt);

            }
    }
}
