import java.util.*;

class Main {
    public static void main(String args[]) throws Exception {
        Scanner kb = new Scanner(System.in);

        int n=kb.nextInt();
        int m=kb.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=kb.nextInt();
        }

        int min=0;
        int sum=0;
        for(int i=0; i<n-2; i++){
            for(int j=i+1; j<n-1; j++){
                for(int k=j+1; k<n; k++){
                    sum=arr[i]+arr[j]+arr[k];
                    if(min<sum&&sum<=m){
                        min=sum;
                        if(sum==m) break;
                    }
                }
            }
        }
        System.out.println(min);
    }
}

