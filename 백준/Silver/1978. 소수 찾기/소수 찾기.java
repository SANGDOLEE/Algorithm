import java.util.*;

class Main {
    public static void main(String args[]) throws Exception {
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++) arr[i]=kb.nextInt();
        int cnt=0;
        int total=0;
        for(int i=0; i<n; i++){
            for(int j=2; j<=arr[i]; j++){
                if(arr[i]%j==0){
                    cnt++;
                }
            }
            if(cnt==1){
                total++;
            }
            cnt=0;
        }
        System.out.println(total);

    }
}

