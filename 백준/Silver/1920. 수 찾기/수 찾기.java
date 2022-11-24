import java.util.*;

class Main {
    public static void main(String args[]) throws Exception {
        Scanner kb = new Scanner(System.in);
        int a=kb.nextInt();
        int[] arr=new int[a];
        for(int i=0; i<a; i++) arr[i]=kb.nextInt();
        int b=kb.nextInt();
        int[] arr2=new int[b];
        for(int i=0; i<b; i++) arr2[i]=kb.nextInt();

        Arrays.sort(arr);

        for(int i=0; i<b; i++){
            System.out.println(binarySearch(arr,arr2[i]));
        }
    }
    public static int binarySearch(int[] arr,int num){
        int lt=0;
        int rt=arr.length-1;
        while(lt<=rt){
            int mid=(lt+rt)/2;
            if(arr[mid]==num) return 1;
            else if(arr[mid]>num) rt=mid-1;
            else if(arr[mid]<num) lt=mid+1;
        }
        return 0;
    }
}
