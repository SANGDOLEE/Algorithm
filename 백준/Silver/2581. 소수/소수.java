import java.util.*;

class Main {
    public static void main(String args[]) throws Exception {
        Scanner kb = new Scanner(System.in);
        int a=kb.nextInt();
        int b=kb.nextInt();

        int[] arr=new int[b+1];
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=2; i<=b; i++){
            if(arr[i]==0){
                list.add(i);
                for(int j=i; j<=b; j+=i){
                    arr[j]=1;
                }
            }
        }
        int sum=0;
        int min=0;
        for(int i=0; i<list.size(); i++){
            if(list.get(i)>=a){
                min=list.get(i);
                break;
            }
        }
        for(int i=0; i<list.size(); i++){
            if(list.get(i)>=a&&list.get(i)<=b){
                sum+=list.get(i);
            }
        }
        if(sum==0) System.out.println("-1");
        else {
            System.out.println(sum);
            System.out.println(min);
        }
    }
}

