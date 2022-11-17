import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int T = kb.nextInt();
        for (int t = 1; t <= T; t++) {
            long n=kb.nextLong();
            long answer=-1;
            long i=1;

            while(i*i*i<=n){
                if(i*i*i==n) {
                    answer = i;
                    break;
                }
                i++;
            }
            System.out.println("#"+t+" "+answer);
        }
    }
}
