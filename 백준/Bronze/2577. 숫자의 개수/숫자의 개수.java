import java.util.*;

class Main {
    public static void main(String args[]) throws Exception {
        Scanner kb = new Scanner(System.in);
        int a=kb.nextInt();
        int b=kb.nextInt();
        int c=kb.nextInt();
        int sum=a*b*c;
        int[] index=new int[10];

        String s=String.valueOf(sum);
        for(int i=0; i<s.length(); i++){
            int t=s.charAt(i)-'0';
            index[t]++;
        }

        for(int i=0; i<10; i++){
            System.out.println(index[i]);
        }
    }
}

