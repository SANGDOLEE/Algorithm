import java.util.*;

class Main{
    public static void main(String args[]) throws Exception{
        Scanner kb=new Scanner(System.in);
        int n=kb.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++) arr[i]=kb.nextInt();
        int target=kb.nextInt();

        Arrays.sort(arr);
        int cnt=0;
        int lt=0;
        int rt=n-1;
        while(lt<rt){
            if(arr[lt]+arr[rt]==target){
                cnt++;
            }
            if(arr[lt]+arr[rt]<=target) {
                lt++;
            }
            else {
                rt--;
            }
        }
        System.out.print(cnt);
    }
}
