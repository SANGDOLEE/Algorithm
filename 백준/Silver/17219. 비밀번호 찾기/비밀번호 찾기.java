import java.util.*;

class Main {
    public static void main(String args[]) throws Exception {
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int m=kb.nextInt();
        kb.nextLine();
        HashMap<String, String> map = new HashMap<>();
        for(int i=0; i<n; i++){
            String temp=kb.nextLine();
            String[] arr=temp.split(" ");
            map.put(arr[0],arr[1]);
        }
        for(int i=0; i<m; i++){
            String search=kb.next();
            System.out.println(map.get(search));
        }
    }
}