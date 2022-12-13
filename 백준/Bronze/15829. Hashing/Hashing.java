import java.util.*;

class Main {
    public static void main(String args[]) throws Exception {
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        String s=kb.next();
        long sum=0;
        double r=0;
        r=Math.pow(31,0);
        for(int i=0; i<n; i++ ){
            sum+=(s.charAt(i)-96)*r;
            r=r*31%1234567891;
        }
        System.out.println(sum%1234567891);

    }
}




