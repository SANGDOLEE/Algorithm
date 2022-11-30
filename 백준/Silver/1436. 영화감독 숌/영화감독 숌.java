import java.util.*;

class Main {
    public static void main(String args[]) throws Exception {
        Scanner kb=new Scanner(System.in);

        int n=kb.nextInt();
        int num=666;
        int cnt=1;
        while(cnt!=n){
            num++;
            if(String.valueOf(num).contains("666"))
                cnt++;
        }
        System.out.println(num);
    }
}

