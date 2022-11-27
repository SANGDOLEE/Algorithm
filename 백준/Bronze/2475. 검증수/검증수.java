import java.util.*;

class Main {
    public static void main(String args[]) throws Exception {
        Scanner kb = new Scanner(System.in);
        String s=kb.nextLine();
        String[] arr=s.split(" ");

        int sum=0;
        for(int i=0; i<arr.length; i++){
            int a=Integer.parseInt(arr[i]);
            sum+=a*a;
        }
        System.out.println(sum%10);
    }
}

