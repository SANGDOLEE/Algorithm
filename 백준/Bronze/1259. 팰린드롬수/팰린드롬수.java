import java.util.*;

class Main {
    public static void main(String args[]) throws Exception {
        Scanner kb = new Scanner(System.in);
        StringBuilder sb=new StringBuilder();

        while(true){
            String s=kb.next();
            if(s.equals("0")) break;
            else{
                sb=new StringBuilder(s).reverse();
                if(s.equals(sb.toString()))
                    System.out.println("yes");
                else
                    System.out.println("no");
            }
        }

    }
}

