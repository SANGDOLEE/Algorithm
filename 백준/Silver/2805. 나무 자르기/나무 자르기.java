import java.util.*;
class Main {
    public static void main(String args[]) throws Exception {
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int m=kb.nextInt();
        int[] arr=new int[n];

        int lt=0;
        int rt=0;

        // 최저값 lt : 최대값 rt
        for(int i=0; i<n; i++){
            arr[i]=kb.nextInt();
            rt=Math.max(rt,arr[i]);
        }

        while(lt<rt){
            int mid=(lt+rt)/2;
            long sum=0;
            for(int x:arr){
                if(x-mid>0){
                    sum+=x-mid;
                }
            }

            if(sum<m){
                rt=mid;
            }
            else{
                lt=mid+1;
            }
        }
        System.out.println(lt-1);
    }
}


