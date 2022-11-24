import java.util.*;

class Main {
    public static void main(String args[]) throws Exception {
        Scanner kb = new Scanner(System.in);
        int[] arr=new int[5];
        int sum=0;
        for(int i=0; i<5; i++) {
            arr[i] = kb.nextInt();
            sum+=arr[i];
        }

        Arrays.sort(arr);
        int mid=arr[arr.length/2];
        int avg=sum/5;
        System.out.println(avg);
        System.out.println(mid);

    }
}
