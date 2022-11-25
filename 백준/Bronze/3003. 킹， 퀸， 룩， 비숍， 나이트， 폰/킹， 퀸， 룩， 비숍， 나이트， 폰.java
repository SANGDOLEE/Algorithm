import java.util.*;

class Main {
    public static void main(String args[]) throws Exception {
        Scanner kb = new Scanner(System.in);
        int[] arr=new int[6];
        for(int i=0; i<6; i++) arr[i]=kb.nextInt();
                    // 2 1 2 1 2 1
        int[] temp={1,1,2,2,2,8};
        // -1 0 0 1 0 7
        for(int i=0; i<6; i++){
            if(arr[i]==temp[i]) System.out.println("0");
            else if(arr[i]>temp[i]) System.out.println(temp[i]-arr[i]);
            else if(temp[i]>arr[i]) System.out.println(temp[i]-arr[i]);
        }
    }
}

