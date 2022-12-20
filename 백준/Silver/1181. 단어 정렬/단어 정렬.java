import java.util.*;

class Main {
    public static void main(String args[]) throws Exception {
        Scanner kb = new Scanner(System.in);
        int N=kb.nextInt();
        String[] arr=new String[N];
        kb.nextLine(); // 개행 버리기

        for(int i=0; i<N; i++) arr[i]=kb.nextLine();

        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                // 단어 길이가 같을 경우
                if(o1.length()==o2.length()){
                    return o1.compareTo(o2);
                }
                // 그 외 경우
                else{
                    return o1.length()-o2.length();
                }
            }
        });
        System.out.println(arr[0]);
        for(int i=1; i<N; i++){
            // 중복 피하기
            if(!arr[i].equals(arr[i-1])){
                System.out.println(arr[i]);
            }
        }
    }
}