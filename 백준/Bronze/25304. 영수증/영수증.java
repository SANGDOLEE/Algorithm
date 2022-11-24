import java.util.*;

class Main {
    public static void main(String args[]) throws Exception {
        Scanner kb = new Scanner(System.in);
        int total=kb.nextInt();
        int n=kb.nextInt();
        int[] arr=new int[n];
        int[] arr2=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=kb.nextInt();
            arr2[i]=kb.nextInt();
        }
        int sum=0;
        for(int i=0; i<n; i++){
            sum+=arr[i]*arr2[i];
        }
        if(total==sum) System.out.println("Yes");
        else System.out.println("No");
    }
}
