import java.util.*;

class Main {
    public static void main(String args[]) throws Exception {
        Scanner kb = new Scanner(System.in);
        String s=kb.next();

        HashMap<Character,Integer> map=new HashMap<>();
        for(char x:s.toUpperCase().toCharArray()){
            map.put(x,map.getOrDefault(x,0)+1);
        }

        char ans=' ';
        int cnt=0;
        int max=Integer.MIN_VALUE;
        for(char key:map.keySet()){
            if(map.get(key)>max) {
                max = map.get(key);
                ans = key;
            }
        }
        for(char key:map.keySet()){
            if(map.get(key)==max)
                cnt++;
        }
        if(cnt>=2) System.out.println("?");
        else System.out.println(ans);
    }
}
