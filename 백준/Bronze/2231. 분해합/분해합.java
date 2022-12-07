import java.util.*;
class Main {
    public static void main(String args[]) throws Exception {
        Scanner kb=new Scanner(System.in);

        int n=kb.nextInt();

        int answer=0;

        for(int i=0; i<n; i++){
            int a=i;
            int sum=0;
            while(a!=0){
                sum+=a%10;
                a/=10;
            }
            if(sum+i==n){
                answer=i;
                break;
            }
        }
        System.out.println(answer);
    }
}