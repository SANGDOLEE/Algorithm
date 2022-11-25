import java.util.*;

class Main {
    public static void main(String args[]) throws Exception {
        Scanner kb=new Scanner(System.in);
        int T=kb.nextInt();
        for(int t=1; t<=T; t++){
           int n=kb.nextInt();
           int[] arr=new int[n];
           int sum=0;
           for(int i=0; i<n; i++) {
               arr[i] = kb.nextInt();
               sum+=arr[i];
           }

           double cnt=0;
           float avg=(float)sum/n;
           for(int i=0; i<n; i++){
               if(arr[i]>avg){
                   cnt++;
               }
           }
           double temp=100.000/n;
            System.out.println(String.format("%.3f",cnt*temp)+"%");

        }
    }
}

