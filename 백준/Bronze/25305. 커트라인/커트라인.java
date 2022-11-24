import java.util.*;

class Main {
    public static void main(String args[]) throws Exception {
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int t=kb.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++) arr[i]=kb.nextInt();

        int index=0;
        Arrays.sort(arr);
        for(int i=arr.length-1; i>=0; i--){
            index++;
            if(index==t){
                System.out.println(arr[i]);
            }
        }

    }
}
