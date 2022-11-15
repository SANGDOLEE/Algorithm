import java.util.Scanner;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int T = kb.nextInt();
        for (int t = 1; t <= T; t++) {
            int n=kb.nextInt();
            int[] arr=new int[n];
            int sum=0;
            for(int i=0; i<n; i++) {
                arr[i] = kb.nextInt();
                sum+=arr[i];
            }
            int avg=sum/n;
            int cnt=0;
            for(int i=0; i<n; i++){
                if(arr[i]<avg)
                    cnt+=avg-arr[i];
            }
            System.out.println("#"+t+" "+cnt);
        }
    }
}
