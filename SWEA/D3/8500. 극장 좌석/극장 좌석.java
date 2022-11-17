import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int T = kb.nextInt();
        for (int t = 1; t <= T; t++) {
            int n=kb.nextInt();
            int[] arr=new int[n];
            int max=0;
            for(int i=0; i<n; i++) {
                arr[i] = kb.nextInt();
                max=Integer.max(max,arr[i]);
            }
            int sum=0;
            for(int i=0; i<n; i++){
                sum+=arr[i];
            }
            sum+=arr.length+max;
            System.out.println("#"+t+" "+sum);
        }
    }
    }
