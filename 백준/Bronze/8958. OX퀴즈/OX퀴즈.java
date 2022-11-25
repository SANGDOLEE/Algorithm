import java.util.*;

class Main {
    public static void main(String args[]) throws Exception {
        Scanner kb=new Scanner(System.in);
        int T=kb.nextInt();
        for(int t=1; t<=T; t++){
            String test=kb.next();

            int sum=0;
            int cnt=0;

            for(int i=0; i<test.length(); i++){
                if(test.charAt(i)=='O'){
                    cnt++;
                    sum+=cnt;
                }else{
                    cnt=0;
                }
            }
            System.out.println(sum);
        }
    }
}

