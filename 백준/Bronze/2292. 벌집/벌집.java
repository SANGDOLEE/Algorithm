import java.util.*;

class Main {
    public static void main(String args[]) throws Exception {
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();

        int i=2;
        int cnt = 1;
        if (n == 1) System.out.println(1);
        else {
            while (i<=n) {
               i=i+(cnt*6);
               cnt++;
            }
            System.out.println(cnt);
        }
            // 1 6 12 18 24 
    }
}

