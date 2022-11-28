import java.util.*;

class Main {
    public static void main(String args[]) throws Exception {
        Scanner kb = new Scanner(System.in);
        StringBuilder sb=new StringBuilder();
        int n=kb.nextInt();
        ArrayList<Integer> list=new ArrayList<>();
    
        for(int i=0; i<n; i++){
            list.add(kb.nextInt());
        }

        Collections.sort(list);

        for(int x:list){
            sb.append(x).append('\n');
        }
        System.out.println(sb);
    }
}

