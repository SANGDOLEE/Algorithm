import java.util.*;

class Main {
    public static void main(String args[]) throws Exception {
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int m=kb.nextInt();
        HashMap<String, Integer> map = new HashMap<>();
        for(int i=0; i<n+m; i++) {
            String temp = kb.next();
            map.put(temp, map.getOrDefault(temp,0)+1);
        }

        int cnt=0;
        ArrayList<String> list= new ArrayList<>();
        for(String key:map.keySet()){
            Integer value=map.get(key);
            if(value==2){
                cnt++;
                list.add(key);
            }
        }
        Collections.sort(list);
        System.out.println(cnt);
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }


    }
}