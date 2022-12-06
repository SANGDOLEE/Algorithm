import java.util.*;
class Main {
    public static void main(String args[]) throws Exception {
         Scanner kb=new Scanner(System.in);

         HashMap<Integer,Integer> map=new HashMap<>();

         int a=kb.nextInt();
         int[] arr2=new int[a];
         for(int i=0; i<a; i++){
             arr2[i]=kb.nextInt();
             map.put(arr2[i], map.getOrDefault(arr2[i],0)+1);
         }

         int b=kb.nextInt();
         int[] arr=new int[b];
         for(int i=0; i<b; i++) arr[i]=kb.nextInt();

         StringBuilder sb=new StringBuilder();
         for(int i=0; i<b; i++){
             if(map.containsKey(arr[i])){
                 sb.append(map.get(arr[i])).append(" ");
             }else{
                 sb.append(0).append(" ");
             }
         }
        System.out.print(sb);
    }
}