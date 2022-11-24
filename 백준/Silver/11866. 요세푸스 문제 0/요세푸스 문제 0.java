import java.util.*;

class Main {
    public static void main(String args[]) throws Exception {
        Scanner kb = new Scanner(System.in);

        int n=kb.nextInt(); //7
        int a=kb.nextInt(); //3

        Queue<Integer> Q=new LinkedList<>();
        for(int i=1; i<=n; i++){
            Q.offer(i);
        }
        ArrayList<Integer> list=new ArrayList<>();
        int index=1;
        while(!Q.isEmpty()){
            int temp=Q.peek();
            if(index%a==0){
                list.add(Q.peek());
                Q.remove();
            }else{
                Q.offer(temp);
                Q.remove();
            }
            index++;
        }
        System.out.print("<");
        for(int i=0; i<list.size()-1; i++){
            System.out.print(list.get(i)+", ");
        }
        System.out.print(list.get(list.size()-1));
        System.out.print(">");
    }
}
