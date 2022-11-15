import java.util.Scanner;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int T = kb.nextInt();
        for (int t = 1; t <= T; t++) {
            int n=kb.nextInt();
            int[] arr=new int[n];
            for(int i=0; i<n; i++) arr[i]=kb.nextInt();

            String answer="Yes";
            Arrays.sort(arr);
            for(int i=0; i<n-1; i++){
                if(arr[i]==arr[i+1]) {
                    answer = "No";
                    break;
                }
            }
            System.out.println("#"+t+" "+answer);
        }
    }
}
