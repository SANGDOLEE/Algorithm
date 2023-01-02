import java.util.*;

class Main {
    public static void main(String args[]) throws Exception {
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int k=kb.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=kb.nextInt();
        }
        int cnt=0;
        int i=n-1;
        while(k>0){
            int temp=arr[i];
            if(k>=temp){
                cnt+=k/temp;
                k=k%temp;
            }else{
                i--;
            }
        }
        System.out.println(cnt);
    }
}