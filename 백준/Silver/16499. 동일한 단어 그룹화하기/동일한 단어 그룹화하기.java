import java.util.*;

class Main {
    public static void main(String args[]) throws Exception {
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        String[] arr=new String[n];
        for(int i=0; i<n; i++){
            arr[i]=kb.next();
        }
        HashMap<String, Integer> map=new HashMap<>();
        for(int i=0; i<n; i++){
            String s=arr[i];
            String[] temp=s.split("");
            Arrays.sort(temp);
            String str="";
            for(int j=0; j<temp.length; j++){
                str+=temp[j];
            }
            map.put(str, map.getOrDefault(str,0)+1);
        }

        System.out.println(map.size());
    }
}