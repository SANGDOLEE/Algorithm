import java.util.*;

class Main {
    public static void main(String args[]) throws Exception {
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++) arr[i]=kb.nextInt();
        int t=kb.nextInt();
        int cnt=0;
        for(int i=0; i<arr.length; i++) {
            if (arr[i] == t)
                cnt++;
        }
        System.out.println(cnt);
    }
}
