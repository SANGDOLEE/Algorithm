import java.util.*;

class Main {
    public static void main(String args[]) throws Exception {
        Scanner kb = new Scanner(System.in);
        int a=kb.nextInt();
        int b=kb.nextInt();

        int[] index=new int[b+1];
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=2; i<=b; i++){
            if(index[i]==0){
                list.add(i);
                for(int j=i; j<=b; j+=i)
                    index[j]=1;
            }
        }
        for(int i=0; i<list.size(); i++){
            if(list.get(i)>=a){
                System.out.println(list.get(i));
            }
        }
    }
}

