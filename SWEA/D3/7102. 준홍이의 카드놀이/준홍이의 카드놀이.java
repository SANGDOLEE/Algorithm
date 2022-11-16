import java.util.Scanner;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int T = kb.nextInt();
        for (int t = 1; t <= T; t++) {
            int a=kb.nextInt();
            int b=kb.nextInt();
            int[] index=new int[a+b+1];

            for(int i=1; i<=a; i++){
                for(int j=1; j<=b; j++){
                    index[i+j]++;
                }
            }

            int max=0;
            for(int i=2; i<index.length; i++){
                if(index[i]>max){
                    max=Math.max(index[i],max);
                }
            }
            System.out.print("#"+t+" ");
            for(int i=0; i<index.length; i++){
                if(index[i]==max)
                    System.out.print(i+" ");
            }
            System.out.println();

        }
    }
}

