import java.util.*;

class Main {
    public static void main(String args[]) throws Exception {
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int m=kb.nextInt();

        HashMap<String, Integer> map = new HashMap<>();
        String[] arr=new String[n];
        for(int i=0; i<n; i++){
            String s=kb.next();
            arr[i]=s;
            map.put(s,i+1);
        }

        for(int i=0; i<m; i++){
            if(kb.hasNextInt()) System.out.println(arr[kb.nextInt()-1]);
            else System.out.println(map.get(kb.next()));
        }

    }
}