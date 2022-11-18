import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int T = kb.nextInt();
        for (int t = 1; t <= T; t++) {
            int a=kb.nextInt();
            int b=kb.nextInt();
            String[] arr1=new String[a];
            String[] arr2=new String[b];
            for(int i=0; i<a; i++) arr1[i]=kb.next();
            for(int i=0; i<b; i++) arr2[i]=kb.next();
            int cnt=0;

            HashMap<String, Integer> map=new HashMap<>();
            for(String x:arr1){
                map.put(x,map.getOrDefault(x,0)+1);
            }
            for(String x:arr2){
                if(map.containsKey(x))
                    cnt++;
            }
            System.out.println("#"+t+" "+cnt);

        }
    }
}

















