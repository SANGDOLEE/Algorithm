import java.util.*;

class Main {
    public static void main(String args[]) throws Exception {
        Scanner kb = new Scanner(System.in);
        int[] arr=new int[10];
        for(int i=0; i<arr.length; i++) arr[i]=kb.nextInt();


        HashSet<Integer> set=new HashSet<Integer>();
        for(int i=0; i<arr.length; i++){
            set.add(arr[i]%42);
        }
        System.out.println(set.size());
    }
}
