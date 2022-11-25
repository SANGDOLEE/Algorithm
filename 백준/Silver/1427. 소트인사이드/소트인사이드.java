import java.util.*;

class Main {
    public static void main(String args[]) throws Exception {
        Scanner kb=new Scanner(System.in);
        int n=kb.nextInt();
        String s=String.valueOf(n);
        int[] arr=new int[s.length()];
        for(int i=0; i<arr.length; i++) arr[i]=s.charAt(i);
        Arrays.sort(arr);
        StringBuilder sb=new StringBuilder();
        for(int i=0; i<arr.length; i++){
            sb.append(arr[i]-'0');
        }
        System.out.println(sb.reverse());

    }
}
