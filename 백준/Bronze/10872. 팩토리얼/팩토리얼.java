import java.util.*;

class Main {
    public static void main(String args[]) throws Exception {
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();

        int sum=recursion((n));
        System.out.println(sum);
    }
    public static int recursion(int n){
        if(n<=1) return 1;
        return n*recursion(n-1);
    }
}
