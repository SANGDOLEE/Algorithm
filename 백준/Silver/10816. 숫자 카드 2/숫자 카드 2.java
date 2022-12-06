import java.util.*;
class Main {
    public static void main(String args[]) throws Exception {
         Scanner kb=new Scanner(System.in);

         HashMap<Integer,Integer> map=new HashMap<>();

         int a=kb.nextInt();
         for(int i=0; i<a; i++){
             int n=kb.nextInt();
             map.put(n, map.getOrDefault(n,0)+1);
         }

         int b=kb.nextInt();
         StringBuilder sb=new StringBuilder();
         for(int i=0; i<b; i++){
             int k=kb.nextInt();
             if(map.containsKey(k)){
                 sb.append(map.get(k)).append(" ");
             }else{
                 sb.append(0).append(" ");
             }
         }
        System.out.print(sb);
    }
}