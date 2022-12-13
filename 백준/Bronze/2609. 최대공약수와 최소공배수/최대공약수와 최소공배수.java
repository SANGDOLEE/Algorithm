import java.util.*;

class Main {
    public static void main(String args[]) throws Exception {
        Scanner kb = new Scanner(System.in);
        int a = kb.nextInt();
        int b = kb.nextInt();
        int max=gcd(a,b); // 최대공약수
        int min=(a*b)/max;
        System.out.println(max);
        System.out.print(min);
    }

    static int gcd(int a, int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
}




