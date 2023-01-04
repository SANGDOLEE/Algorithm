import java.util.*;

class Main {
    public static void main(String args[]) throws Exception {
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++) arr[i]=kb.nextInt();

        Arrays.sort(arr);
        int wait_time=0;
        int sum=0;
        for(int i=0; i<n; i++){
            sum+=wait_time+arr[i];
            wait_time+=arr[i];
        }
        System.out.println(sum);
    }
}