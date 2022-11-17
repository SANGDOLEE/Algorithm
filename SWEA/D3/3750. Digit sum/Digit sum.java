import java.util.Scanner;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int T = kb.nextInt();
        for (int t = 1; t <= T; t++) {
            long n=kb.nextLong();
            if(n<10) {
                System.out.println("#" + t + " " + n);
                continue;
            }

            int sum=0;
            String s=String.valueOf(n);
            while(s.length()>=2){
                String[] arr=s.split("");
                for(int i=0; i<arr.length; i++) {
                    sum += Integer.parseInt(arr[i]);
                }
                s=String.valueOf(sum);
                sum=0;
            }
            System.out.println("#"+t+" "+s);
        }
    }
}


