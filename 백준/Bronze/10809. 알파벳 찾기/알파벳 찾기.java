import java.util.*;

class Main {
    public static void main(String args[]) throws Exception {
        Scanner kb = new Scanner(System.in);
        String s = kb.next();
        String[] str=s.split("");
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        String[] arr=alpha.split("");
        String[] answer = new String[alpha.length()];

        for(int i=0; i<arr.length; i++){
            if(!s.contains(arr[i])){
                answer[i]="-1";
            }else{
                answer[i]="";
                for(int j=0; j<s.length(); j++){
                    if(arr[i].equals(str[j])){
                        answer[i]=String.valueOf(j);
                        break;
                    }
                }
            }
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(answer[i]+" ");
        }


    }
}
