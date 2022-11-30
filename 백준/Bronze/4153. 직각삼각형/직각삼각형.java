import java.util.*;

class Main {
    public static void main(String args[]) throws Exception {

        Scanner kb=new Scanner(System.in);
        while(true){
            int a=kb.nextInt();
            int b=kb.nextInt();
            int c=kb.nextInt();
            int[] arr=new int[3];
            arr[0]=a;
            arr[1]=b;
            arr[2]=c;
            Arrays.sort(arr);
            if(arr[0]==0&&arr[1]==0&&arr[2]==0)
                break;
            else if(arr[2]*arr[2]==arr[0]*arr[0]+arr[1]*arr[1])
                System.out.println("right");
            else
                System.out.println("wrong");
        }
    }
}

